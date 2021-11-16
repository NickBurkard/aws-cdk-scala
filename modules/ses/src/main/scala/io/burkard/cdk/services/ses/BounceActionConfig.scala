package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BounceActionConfig {

  def apply(
    smtpReplyCode: String,
    sender: String,
    message: String,
    statusCode: Option[String] = None,
    topicArn: Option[String] = None
  ): software.amazon.awscdk.services.ses.BounceActionConfig =
    (new software.amazon.awscdk.services.ses.BounceActionConfig.Builder)
      .smtpReplyCode(smtpReplyCode)
      .sender(sender)
      .message(message)
      .statusCode(statusCode.orNull)
      .topicArn(topicArn.orNull)
      .build()
}
