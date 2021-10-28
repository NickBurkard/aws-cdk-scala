package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object WorkmailActionProperty {

  def apply(
    topicArn: Option[String] = None,
    organizationArn: Option[String] = None
  ): software.amazon.awscdk.services.ses.CfnReceiptRule.WorkmailActionProperty =
    (new software.amazon.awscdk.services.ses.CfnReceiptRule.WorkmailActionProperty.Builder)
      .topicArn(topicArn.orNull)
      .organizationArn(organizationArn.orNull)
      .build()
}
