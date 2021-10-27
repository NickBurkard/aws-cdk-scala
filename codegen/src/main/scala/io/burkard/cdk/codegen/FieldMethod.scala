package io.burkard.cdk.codegen

import java.lang.reflect.{Method, Modifier}

// Method associated to setting a field in a CDK builder.
final case class FieldMethod private(
  name: String,
  typeName: String,
  underlying: Method
) {
  lazy val asParameter: String =
    s"$paramName: Option[$fullTypeName] = None"

  lazy val asBuilderMethod: String =
    s".$paramName($paramName$convert$defaultValue)"

  // Are generic collections used?
  lazy val requiresJavaConverters: Boolean =
    fullTypeName.contains("List[") || fullTypeName.contains("Map[")

  lazy val requiresBooleanBoxing: Boolean =
    fullTypeName.contains("Boolean")

  lazy val defaultValue: String =
    if (typeName.contains("Boolean")) {
      ".getOrElse(java.lang.Boolean.FALSE)"
    } else {
      ".orNull"
    }

  private[this] lazy val convert: String =
    if (requiresJavaConverters) {
      // Convert nested maps if necessary.
      if (fullTypeName.indexOf("Map") != fullTypeName.lastIndexOf("Map")) {
        ".map(_.view.mapValues(_.asJava).toMap.asJava)"
      } else {
        ".map(_.asJava)"
      }
    } else if (requiresBooleanBoxing) {
      ".map(Boolean.box)"
    }else {
      ""
    }

  lazy val paramName: String = literallyIdentify(name)

  private[this] lazy val fullTypeName: String =
    literallyIdentify(rewriteJavaTypes(typeName))
}

object FieldMethod {
  private[this] val nonFieldMethods: Set[String] =
    Set("create", "build", "equals", "getClass", "hashCode", "notify", "notifyAll", "wait", "toString")

  def build(underlying: Method): Option[FieldMethod] =
    if (!(nonFieldMethods.contains(underlying.getName) || Modifier.isStatic(underlying.getModifiers))) {
      underlying.getGenericParameterTypes.toList match {
        // Must not be `IResolvable` from JSII.
        case value :: Nil =>
          Option.when(value.getTypeName != "software.amazon.awscdk.IResolvable")(
            FieldMethod(
              underlying.getName,
              value.getTypeName.replaceAll("\\$", "."),
              underlying
            )
          )

        case _ =>
          None
      }
    } else {
      None
    }
}