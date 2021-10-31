package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BounceActionConfig {

  def apply(
    statusCode: Option[String] = None,
    topicArn: Option[String] = None,
    smtpReplyCode: Option[String] = None,
    sender: Option[String] = None,
    message: Option[String] = None
  ): software.amazon.awscdk.services.ses.BounceActionConfig =
    (new software.amazon.awscdk.services.ses.BounceActionConfig.Builder)
      .statusCode(statusCode.orNull)
      .topicArn(topicArn.orNull)
      .smtpReplyCode(smtpReplyCode.orNull)
      .sender(sender.orNull)
      .message(message.orNull)
      .build()
}
