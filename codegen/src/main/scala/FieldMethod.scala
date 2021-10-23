import java.lang.reflect.{Method, Modifier}

final case class FieldMethod private(name: String, typeName: String, underlying: Method) {
  lazy val asParameter: String =
    s"$name: Option[$typeName] = None"
}

object FieldMethod {
  private[this] val nonFieldMethods: Set[String] =
    Set("create", "build", "equals", "getClass", "hashCode", "notify", "notifyAll", "wait", "toString")

  def build(underlying: Method): Option[FieldMethod] =
    if (!(nonFieldMethods.contains(underlying.getName) || Modifier.isStatic(underlying.getModifiers))) {
      underlying.getParameterTypes.toList match {
        // Must not be `IResolvable` from JSII.
        case value :: Nil =>
          Option.when(value.getSimpleName != "IResolvable") {
            FieldMethod(underlying.getName, value.getTypeName, underlying)
          }

        case _ =>
          None
      }
    } else {
      None
    }
}