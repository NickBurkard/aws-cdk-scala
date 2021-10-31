package io.burkard.cdk.services.ssmincidents

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NotificationTargetItemProperty {

  def apply(
    snsTopicArn: Option[String] = None
  ): software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.NotificationTargetItemProperty =
    (new software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.NotificationTargetItemProperty.Builder)
      .snsTopicArn(snsTopicArn.orNull)
      .build()
}
