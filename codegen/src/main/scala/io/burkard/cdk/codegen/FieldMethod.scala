package io.burkard.cdk.codegen

import java.lang.reflect.{Method, Modifier}

// Method associated to setting a field in a CDK builder.
final case class FieldMethod private(
  parameterName: String,
  methodName: String,
  typeName: String,
  optional: Boolean
) {
  lazy val asTypeAnnotatedParameter: String =
    if (optional) {
      s"$actualParameterName: Option[$fullTypeName] = None"
    } else {
      s"$actualParameterName: $fullTypeName"
    }

  lazy val asBuilderMethod: String = s".$actualMethodName($asValue)"

  lazy val asValue: String = s"$actualParameterName$convert$defaultValue"

  // Are generic collections used?
  lazy val requiresAsJava: Boolean = requiresJavaConverters(fullTypeName)

  lazy val requiresBooleanBoxing: Boolean = typeName.contains("java.lang.Boolean")

  lazy val defaultValue: String =
    if (optional && typeName == "java.lang.Boolean") {
      ".getOrElse(java.lang.Boolean.FALSE)"
    } else if (optional) {
      ".orNull"
    } else {
      ""
    }

  private[this] lazy val convert: String =
    if (requiresAsJava) {
      val base = if (
        fullTypeName.indexOf("Map[") != fullTypeName.lastIndexOf("Map[") ||
          fullTypeName.contains("Map[") && fullTypeName.indexOf("Map[") < fullTypeName.lastIndexOf("List[")
      ) {
        ".view.mapValues(_.asJava).toMap.asJava"
      } else if (
        fullTypeName.contains("Map[") &&
          fullTypeName.indexOf("Map[") < fullTypeName.lastIndexOf("Boolean")
      ) {
        ".view.mapValues(Boolean.box).toMap.asJava"
      } else if (
        fullTypeName.contains("List[") && (
          fullTypeName.indexOf("List[") < fullTypeName.indexOf("Map[") ||
            fullTypeName.indexOf("List[") < fullTypeName.lastIndexOf("List[")
        )
      ) {
        ".map(_.asJava).asJava"
      } else {
        ".asJava"
      }

      if (optional) {
        s".map(_$base)"
      } else {
        base
      }
    } else if (optional && requiresBooleanBoxing) {
      ".map(Boolean.box)"
    } else {
      ""
    }

  lazy val actualParameterName: String = literallyIdentify(parameterName)

  lazy val actualMethodName: String = literallyIdentify(methodName)

  private[this] lazy val fullTypeName: String =
    literallyIdentify(rewriteJavaTypes(typeName))
}

object FieldMethod {
  private[this] val nonFieldMethods: Set[String] =
    Set("create", "build", "equals", "getClass", "hashCode", "notify", "notifyAll", "wait", "toString")

  private[codegen] def validFieldMethodTypeName(underlying: Method): Option[String] =
    if (!(nonFieldMethods.contains(underlying.getName) || Modifier.isStatic(underlying.getModifiers))) {
      underlying.getGenericParameterTypes.toList match {
        // Must not be `IResolvable` from JSII.
        case value :: Nil =>
          Option.when(value.getTypeName != "software.amazon.awscdk.IResolvable")(
            value.getTypeName.replaceAll("\\$", ".")
          )

        case _ =>
          None
      }
    } else {
      None
    }
}