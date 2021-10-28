package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LambdaActionProperty {

  def apply(
    invocationType: Option[String] = None,
    topicArn: Option[String] = None,
    functionArn: Option[String] = None
  ): software.amazon.awscdk.services.ses.CfnReceiptRule.LambdaActionProperty =
    (new software.amazon.awscdk.services.ses.CfnReceiptRule.LambdaActionProperty.Builder)
      .invocationType(invocationType.orNull)
      .topicArn(topicArn.orNull)
      .functionArn(functionArn.orNull)
      .build()
}
