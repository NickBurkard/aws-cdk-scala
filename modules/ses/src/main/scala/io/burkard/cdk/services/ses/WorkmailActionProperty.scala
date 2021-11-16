package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WorkmailActionProperty {

  def apply(
    organizationArn: String,
    topicArn: Option[String] = None
  ): software.amazon.awscdk.services.ses.CfnReceiptRule.WorkmailActionProperty =
    (new software.amazon.awscdk.services.ses.CfnReceiptRule.WorkmailActionProperty.Builder)
      .organizationArn(organizationArn)
      .topicArn(topicArn.orNull)
      .build()
}
