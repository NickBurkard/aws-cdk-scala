package io.burkard.cdk.services.lambda


sealed abstract class RuntimeFamily(val underlying: software.amazon.awscdk.services.lambda.RuntimeFamily)
  extends Product
    with Serializable


object RuntimeFamily {
  implicit def toAws(value: RuntimeFamily): software.amazon.awscdk.services.lambda.RuntimeFamily =
    Option(value).map(_.underlying).orNull

  case object Nodejs
    extends RuntimeFamily(software.amazon.awscdk.services.lambda.RuntimeFamily.NODEJS)

  case object Java
    extends RuntimeFamily(software.amazon.awscdk.services.lambda.RuntimeFamily.JAVA)

  case object Python
    extends RuntimeFamily(software.amazon.awscdk.services.lambda.RuntimeFamily.PYTHON)

  case object DotnetCore
    extends RuntimeFamily(software.amazon.awscdk.services.lambda.RuntimeFamily.DOTNET_CORE)

  case object Go
    extends RuntimeFamily(software.amazon.awscdk.services.lambda.RuntimeFamily.GO)

  case object Ruby
    extends RuntimeFamily(software.amazon.awscdk.services.lambda.RuntimeFamily.RUBY)

  case object Other
    extends RuntimeFamily(software.amazon.awscdk.services.lambda.RuntimeFamily.OTHER)
}
