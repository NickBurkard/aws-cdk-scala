package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SNSActionProperty {

  def apply(
    topicArn: Option[String] = None,
    encoding: Option[String] = None
  ): software.amazon.awscdk.services.ses.CfnReceiptRule.SNSActionProperty =
    (new software.amazon.awscdk.services.ses.CfnReceiptRule.SNSActionProperty.Builder)
      .topicArn(topicArn.orNull)
      .encoding(encoding.orNull)
      .build()
}
