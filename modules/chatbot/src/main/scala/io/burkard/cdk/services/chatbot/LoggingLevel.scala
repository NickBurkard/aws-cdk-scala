package io.burkard.cdk.services.chatbot


sealed abstract class LoggingLevel(val underlying: software.amazon.awscdk.services.chatbot.LoggingLevel)
  extends Product
    with Serializable


object LoggingLevel {
  implicit def toAws(value: LoggingLevel): software.amazon.awscdk.services.chatbot.LoggingLevel =
    Option(value).map(_.underlying).orNull

  case object Error
    extends LoggingLevel(software.amazon.awscdk.services.chatbot.LoggingLevel.ERROR)

  case object Info
    extends LoggingLevel(software.amazon.awscdk.services.chatbot.LoggingLevel.INFO)

  case object None
    extends LoggingLevel(software.amazon.awscdk.services.chatbot.LoggingLevel.NONE)
}
