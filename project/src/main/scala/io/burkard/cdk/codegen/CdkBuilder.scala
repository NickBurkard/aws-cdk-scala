package io.burkard.cdk.codegen

import java.lang.reflect.{Method, Modifier}

import scala.annotation.nowarn
import scala.util.Try

import sbt._

import CdkBuilder.ConstructorType

// Class instance builder provided by the CDK.
final case class CdkBuilder private (
  instanceCanonicalName: String,
  instanceSimpleName: String,
  constructorType: ConstructorType,
  underlying: Class[_]
) {
  // The required field names of the underlying instance.
  private lazy val requiredFieldNames: Set[String] =
    requiredFieldNamesByProps
      .orElse(requiredFieldNamesByInterface)
      .getOrElse(Set.empty)

  // Attempt to find required field names via `props` field.
  private[this] lazy val requiredFieldNamesByProps: Option[Set[String]] =
    for {
      // The `props` field is a builder for all required & optional properties.
      propsBuilder <- Try(underlying.getDeclaredField("props")).toOption.map(_.getType)

      // The `build` method returns an instance of the props itself, which needs to be inspected.
      props <- Try(propsBuilder.getDeclaredMethod("build")).toOption.map(_.getReturnType)
    } yield props.requiredFieldNames

  // Attempt to find required field names by the builder interface.
  private[this] lazy val requiredFieldNamesByInterface: Option[Set[String]] =
    for {
      genericInterfaces <- Try(underlying.getGenericInterfaces).toOption.map(_.toList)

      // Need to dig through generic interfaces for the associated props class name.
      propsClassName <- genericInterfaces.collectFirst {
        case i if i.getTypeName.startsWith("software.amazon.jsii.Builder<") =>
          i.getTypeName.stripPrefix("software.amazon.jsii.Builder<").stripSuffix(">")
      }

      props <- Try(Class.forName(propsClassName)).toOption
    } yield props.requiredFieldNames

  @nowarn("cat=deprecation")
  // [0, N] field methods of the underlying builder. All non-optional fields appear before optional fields.
  private[this] lazy val fieldMethods: List[FieldMethod] =
    underlying
      .getMethods
      .toList
      // Only preserve methods with valid type names.
      .flatMap { method =>
        FieldMethod
          .validFieldMethodTypeName(method)
          .map(methodName => (method.getName, method.getAnnotations.toList, methodName))
      }
      .groupBy(_._1)
      .mapValues(_.map { case (_, annotations, methodName) => (annotations, methodName) })
      // Potentially rename shared field methods.
      .flatMap {
        // Name is unique, do nothing extra.
        case (methodName, (annotations, typeName) :: Nil) =>
          List(
            FieldMethod(
              methodName,
              methodName,
              typeName,
              isOptional = !requiredFieldNames.contains(methodName),
              annotations
            )
          )

        // Name is shared, need to rename based on index.
        // TODO Change to something more meaningful.
        case (methodName, typeNames) =>
          typeNames.zipWithIndex.map { case ((annotations, typeName), index) =>
            FieldMethod(
              s"$methodName$index",
              methodName,
              typeName,
              isOptional = !requiredFieldNames.contains(methodName),
              annotations
            )
          }
      }
      .toList
      .sortBy(_.isOptional)

  lazy val packageName: String = renameCdkPackage(instanceCanonicalName, dropLast = 1)

  // `parameterName: type`, potentially with default value.
  lazy val typeAnnotatedParameters: List[String] = fieldMethods.map(_.asTypeAnnotatedParameter)

  lazy val parameterNames: List[String] = fieldMethods.map(_.actualParameterName)

  // `.builderMethodName(parameterName)`, potentially with Java conversions and / or default value.
  lazy val builderMethods: List[String] = fieldMethods.map(_.asBuilderMethod)

  private[this] lazy val requiresJavaConvertersImport: Boolean = {
    lazy val fieldMethodsRequireAsJava = fieldMethods.exists(_.requiresAsJava)
    lazy val createMethodsRequireAsJava = constructorType match {
      case CdkBuilder.ConstructorType.CreateParameters(createParameters) =>
        createParameters.exists(_.requiresAsJava)

      case _ =>
        false
    }

    fieldMethodsRequireAsJava || createMethodsRequireAsJava
  }

  // Potential imports for the source file.
  // TODO Switch to `scala.jdk.CollectionConverters._` after dropping Scala 2.12.
  lazy val imports: String =
  if (requiresJavaConvertersImport) {
    "\nimport scala.collection.JavaConverters._\n"
  } else {
    ""
  }

  lazy val suppressDeprecation: String =
    if (isDeprecatedBuilder || requiresJavaConvertersImport || usesDeprecatedMethods) {
      "\n@scala.annotation.nowarn(\"cat=deprecation\")"
    } else {
      ""
    }

  private[this] lazy val usesDeprecatedMethods: Boolean = {
    lazy val fieldMethodsDeprecated = fieldMethods.exists(_.isDeprecated)
    lazy val createMethodsDeprecated = constructorType match {
      case CdkBuilder.ConstructorType.CreateParameters(createParameters) =>
        createParameters.exists(_.isDeprecated)

      case _ =>
        false
    }

    fieldMethodsDeprecated || createMethodsDeprecated
  }

  private[this] lazy val isDeprecatedBuilder: Boolean =
    underlying.getAnnotations.toList.exists(_.annotationType().getSimpleName == "Deprecated")

  // What the apply method's signature looks like, based on constructor type.
  lazy val applyMethodSignature: String = constructorType match {
    // Add in fields as parameters if required.
    case CdkBuilder.ConstructorType.CreateContextAndId =>
      if (fieldMethods.nonEmpty) {
        s"""def apply(
           |    internalResourceId: String,
           |    ${typeAnnotatedParameters.mkString(",\n    ")}
           |  )(implicit stackCtx: software.amazon.awscdk.Stack): $instanceCanonicalName""".stripMargin
      } else {
        s"def apply(internalResourceId: String)(implicit stackCtx: software.amazon.awscdk.Stack): $instanceCanonicalName"
      }

    // Add in create params first (required) and potentially fields as params (optional).
    case CdkBuilder.ConstructorType.CreateParameters(createParameters) =>
      if (fieldMethods.nonEmpty) {
        s"""def apply(
           |    ${createParameters.map(_.asTypeAnnotatedParameter).mkString(",\n    ")},
           |    ${typeAnnotatedParameters.mkString(",\n    ")}
           |  ): $instanceCanonicalName""".stripMargin
      } else {
        s"""def apply(
           |    ${createParameters.map(_.asTypeAnnotatedParameter).mkString(",\n    ")}
           |  ): $instanceCanonicalName""".stripMargin
      }

    // Add in fields as parameters if required.
    case CdkBuilder.ConstructorType.CreateNoParameters | CdkBuilder.ConstructorType.DirectConstructorNoParameters =>
      if (fieldMethods.nonEmpty) {
        s"""def apply(
           |    ${typeAnnotatedParameters.mkString(",\n    ")}
           |  ): $instanceCanonicalName""".stripMargin
      } else {
        s"def apply: $instanceCanonicalName"
      }
  }

  // The syntax for creating the underlying builder.
  lazy val builderSyntax: String = constructorType match {
    // Supply the implicit stack context and the resource ID.
    case ConstructorType.CreateContextAndId =>
      s"""$instanceCanonicalName.Builder
         |      .create(stackCtx, internalResourceId)""".stripMargin

    // Supply required parameters to the `create` method.
    case ConstructorType.CreateParameters(createParameters) =>
      s"""$instanceCanonicalName.Builder
         |      .create(${createParameters.map(_.asValue).mkString(", ")})""".stripMargin

    // `create` method requires no parameters.
    case ConstructorType.CreateNoParameters =>
      s"""$instanceCanonicalName.Builder
         |      .create()""".stripMargin

    // Builder is constructed via `new` syntax.
    case ConstructorType.DirectConstructorNoParameters =>
      s"(new $instanceCanonicalName.Builder)"
  }
}

object CdkBuilder {
  implicit val sourceGenerator: SourceGenerator[CdkBuilder] =
    new SourceGenerator[CdkBuilder] {
      override def baseFile(root: File, source: CdkBuilder): File =
        root /~ source.packageName.replace('.', '/') / s"${source.instanceSimpleName}.scala"

      override def content(source: CdkBuilder): String =
        s"""package ${source.packageName}
           |${source.imports}${source.suppressDeprecation}
           |@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
           |object ${source.instanceSimpleName} {
           |
           |  ${source.applyMethodSignature} =
           |    ${source.builderSyntax}
           |      ${source.builderMethods.mkString("\n      ")}
           |      .build()
           |}
           |""".stripMargin
    }

  // Using Java reflection to identify which CDK classes we can codegen.
  // Not using Scala reflection because of 2.x/3.x API differences.
  def build(underlying: Class[_]): Option[CdkBuilder] =
    if (underlying.getSimpleName == "Builder") {
      for {
        // Pick the constructor type.
        constructorType <- constructorType(underlying)

        // Must have a `build` method.
        _ <- buildMethod(underlying)

        instanceCanonicalName = underlying.getCanonicalName.split("\\.").toList.dropRight(1).mkString(".")

        instanceSimpleName <- instanceCanonicalName.split("\\.").toList.lastOption
      } yield CdkBuilder(instanceCanonicalName, instanceSimpleName, constructorType, underlying)
    } else {
      None
    }

  // What type of constructor is used to create the builder.
  sealed trait ConstructorType extends Product with Serializable

  object ConstructorType {
    // public static Builder create(context, id)
    case object CreateContextAndId extends ConstructorType

    // public static Builder create(...)
    final case class CreateParameters(createParameters: List[FieldMethod]) extends ConstructorType

    // public static Builder create()
    case object CreateNoParameters extends ConstructorType

    // new Builder()
    case object DirectConstructorNoParameters extends ConstructorType
  }

  private[this] def constructorType(underlying: Class[_]): Option[ConstructorType] =
    underlying.getMethods.toList
      // Pick "create" method with most parameters first.
      .sortBy(_.getParameterCount)
      .collectFirst {
        case m if m.getName == "create" && Modifier.isStatic(m.getModifiers) =>
          if (isContextAndIdConstructor(m)) {
            ConstructorType.CreateContextAndId
          } else if (m.getParameterCount != 0) {
            ConstructorType.CreateParameters(
              underlying
                .getDeclaredFields
                .toList
                .filterNot(_.getType.getName.contains("Builder"))
                .map { field =>
                  FieldMethod(
                    field.getName,
                    field.getName,
                    field.getGenericType.getTypeName,
                    isOptional = false,
                    field.getAnnotations.toList
                  )
                }
            )
          } else {
            ConstructorType.CreateNoParameters
          }
      }
      // Or, check if there's a public constructor with no parameters.
      .orElse(
        underlying.getConstructors.toList.collectFirst {
          case c if c.getParameterCount == 0 && Modifier.isPublic(c.getModifiers) =>
            ConstructorType.DirectConstructorNoParameters
        }
      )

  // Does a method have the type signature of `create(context, id)`?
  private[this] def isContextAndIdConstructor(m: Method): Boolean =
    m.getParameterTypes.toList.map(_.getSimpleName) match {
      case "Construct" :: "String" :: Nil =>
        true

      case _ =>
        false
    }

  // public Underlying build()
  private[this] def buildMethod(underlying: Class[_]): Option[Method] =
    underlying.getMethods
      .find(m => m.getName == "build" && !Modifier.isStatic(m.getModifiers) && m.getParameterCount == 0)
}

