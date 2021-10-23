import java.lang.reflect.{Method, Modifier}

final case class FieldMethod private(
  name: String,
  typeName: String,
  typeParameters: List[String],
  underlying: Method
) {
  import FieldMethod._

  lazy val asParameter: String =
    s"$paramName: Option[$fullTypeName] = None"

  lazy val asBuilderMethod: String =
    s".$paramName($paramName.orNull)"

  private[this] lazy val paramName: String =
    if (reservedWords.contains(name)) {
      s"`$name`"
    } else {
      name
    }

  private[this] lazy val fullTypeName: String =
    s"${rewrittenTypes.getOrElse(typeName, typeName)}$parameterizedTypes"

  private[this] lazy val parameterizedTypes: String =
    if (typeParameters.nonEmpty) {
      typeParameters
        .map(tp => handleExistential(rewrittenTypes.getOrElse(tp, tp)))
        .mkString("[", ", ", "]")
    } else {
      ""
    }
}

object FieldMethod {
  private[this] val nonFieldMethods: Set[String] =
    Set("create", "build", "equals", "getClass", "hashCode", "notify", "notifyAll", "wait", "toString")

  private val reservedWords: Set[String] =
    Set(
      "abstract", "case", "catch", "class", "def", "do", "else", "extends", "false", "final", "finally","for",
      "forSome", "if", "implicit", "import", "lazy", "match", "new", "null", "object", "override", "package",
      "private", "protected", "return", "sealed", "super", "this", "throw", "trait", "try", "true", "type",
      "val", "var", "while", "with", "yield"
    )

  private val rewrittenTypes: Map[String, String] =
    Map(
      "java.lang.Boolean" -> "Boolean",
      "java.lang.Number" -> "Number",
      "java.lang.Object" -> "AnyRef",
      "java.lang.String" -> "String",
      "java.util.Map" -> "Map",
      "java.util.List" -> "List"
    )

  private def handleExistential(typeParameter: String): String =
    typeParameter match {
      case existentialWithBound(boundary) =>
        s"_ <: $boundary"

      case "?" =>
        "_"

      case _ =>
        typeParameter
    }

  private val javaMap = raw"(java\.util\.Map)<(.+), (.+)>".r

  private val javaList = raw"(java\.util\.List)<(.+)>".r

  private val existentialWithBound = raw"\? extends (.+)".r

  def build(underlying: Method): Option[FieldMethod] =
    if (!(nonFieldMethods.contains(underlying.getName) || Modifier.isStatic(underlying.getModifiers))) {
      underlying.getGenericParameterTypes.toList match {
        // Must not be `IResolvable` from JSII.
        case value :: Nil =>
          Option.when(value.getTypeName != "software.amazon.awscdk.IResolvable") {
            val (typeName, typeParameters) = value.getTypeName match {
              case javaMap(map, k, v) =>
                (map, List(k, v))

              case javaList(list, t) =>
                (list, List(t))

              case _ =>
                (value.getTypeName.replace("$", "."), Nil)
            }

            FieldMethod(
              underlying.getName,
              typeName,
              typeParameters,
              underlying
            )
          }

        case _ =>
          None
      }
    } else {
      None
    }
}