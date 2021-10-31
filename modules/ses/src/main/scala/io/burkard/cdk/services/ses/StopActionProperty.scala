package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StopActionProperty {

  def apply(
    scope: Option[String] = None,
    topicArn: Option[String] = None
  ): software.amazon.awscdk.services.ses.CfnReceiptRule.StopActionProperty =
    (new software.amazon.awscdk.services.ses.CfnReceiptRule.StopActionProperty.Builder)
      .scope(scope.orNull)
      .topicArn(topicArn.orNull)
      .build()
}
