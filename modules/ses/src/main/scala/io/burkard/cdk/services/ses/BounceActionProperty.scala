package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BounceActionProperty {

  def apply(
    statusCode: Option[String] = None,
    topicArn: Option[String] = None,
    smtpReplyCode: Option[String] = None,
    sender: Option[String] = None,
    message: Option[String] = None
  ): software.amazon.awscdk.services.ses.CfnReceiptRule.BounceActionProperty =
    (new software.amazon.awscdk.services.ses.CfnReceiptRule.BounceActionProperty.Builder)
      .statusCode(statusCode.orNull)
      .topicArn(topicArn.orNull)
      .smtpReplyCode(smtpReplyCode.orNull)
      .sender(sender.orNull)
      .message(message.orNull)
      .build()
}
