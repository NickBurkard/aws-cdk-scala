package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BounceActionProperty {

  def apply(
    smtpReplyCode: String,
    sender: String,
    message: String,
    statusCode: Option[String] = None,
    topicArn: Option[String] = None
  ): software.amazon.awscdk.services.ses.CfnReceiptRule.BounceActionProperty =
    (new software.amazon.awscdk.services.ses.CfnReceiptRule.BounceActionProperty.Builder)
      .smtpReplyCode(smtpReplyCode)
      .sender(sender)
      .message(message)
      .statusCode(statusCode.orNull)
      .topicArn(topicArn.orNull)
      .build()
}
