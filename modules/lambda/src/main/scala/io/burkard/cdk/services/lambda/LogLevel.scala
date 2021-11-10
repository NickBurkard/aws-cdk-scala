package io.burkard.cdk.services.lambda


sealed abstract class LogLevel(val underlying: software.amazon.awscdk.services.lambda.nodejs.LogLevel)
  extends Product
    with Serializable


object LogLevel {
  implicit def toAws(value: LogLevel): software.amazon.awscdk.services.lambda.nodejs.LogLevel =
    Option(value).map(_.underlying).orNull

  case object Info
    extends LogLevel(software.amazon.awscdk.services.lambda.nodejs.LogLevel.INFO)

  case object Warning
    extends LogLevel(software.amazon.awscdk.services.lambda.nodejs.LogLevel.WARNING)

  case object Error
    extends LogLevel(software.amazon.awscdk.services.lambda.nodejs.LogLevel.ERROR)

  case object Silent
    extends LogLevel(software.amazon.awscdk.services.lambda.nodejs.LogLevel.SILENT)
}
