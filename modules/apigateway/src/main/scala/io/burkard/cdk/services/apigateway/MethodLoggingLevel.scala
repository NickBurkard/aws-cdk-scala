package io.burkard.cdk.services.apigateway

sealed abstract class MethodLoggingLevel(val underlying: software.amazon.awscdk.services.apigateway.MethodLoggingLevel)
  extends Product
    with Serializable

object MethodLoggingLevel {
  implicit def toAws(value: MethodLoggingLevel): software.amazon.awscdk.services.apigateway.MethodLoggingLevel =
    Option(value).map(_.underlying).orNull

  case object Error
    extends MethodLoggingLevel(software.amazon.awscdk.services.apigateway.MethodLoggingLevel.ERROR)

  case object Info
    extends MethodLoggingLevel(software.amazon.awscdk.services.apigateway.MethodLoggingLevel.INFO)

  case object Off
    extends MethodLoggingLevel(software.amazon.awscdk.services.apigateway.MethodLoggingLevel.OFF)
}
