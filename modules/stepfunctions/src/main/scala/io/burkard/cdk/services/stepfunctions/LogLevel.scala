package io.burkard.cdk.services.stepfunctions


sealed abstract class LogLevel(val underlying: software.amazon.awscdk.services.stepfunctions.LogLevel)
  extends Product
    with Serializable


object LogLevel {
  implicit def toAws(value: LogLevel): software.amazon.awscdk.services.stepfunctions.LogLevel =
    Option(value).map(_.underlying).orNull

  case object Off
    extends LogLevel(software.amazon.awscdk.services.stepfunctions.LogLevel.OFF)

  case object All
    extends LogLevel(software.amazon.awscdk.services.stepfunctions.LogLevel.ALL)

  case object Error
    extends LogLevel(software.amazon.awscdk.services.stepfunctions.LogLevel.ERROR)

  case object Fatal
    extends LogLevel(software.amazon.awscdk.services.stepfunctions.LogLevel.FATAL)
}
