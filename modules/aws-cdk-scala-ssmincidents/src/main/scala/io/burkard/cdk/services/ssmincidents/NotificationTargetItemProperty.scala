package io.burkard.cdk.services.ssmincidents

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NotificationTargetItemProperty {

  def apply(
    snsTopicArn: Option[String] = None
  ): software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.NotificationTargetItemProperty =
    (new software.amazon.awscdk.services.ssmincidents.CfnResponsePlan.NotificationTargetItemProperty.Builder)
      .snsTopicArn(snsTopicArn.orNull)
      .build()
}
