package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaActionProperty {

  def apply(
    functionArn: String,
    invocationType: Option[String] = None,
    topicArn: Option[String] = None
  ): software.amazon.awscdk.services.ses.CfnReceiptRule.LambdaActionProperty =
    (new software.amazon.awscdk.services.ses.CfnReceiptRule.LambdaActionProperty.Builder)
      .functionArn(functionArn)
      .invocationType(invocationType.orNull)
      .topicArn(topicArn.orNull)
      .build()
}
