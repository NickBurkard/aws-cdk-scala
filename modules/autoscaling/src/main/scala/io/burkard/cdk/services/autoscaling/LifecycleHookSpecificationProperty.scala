package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LifecycleHookSpecificationProperty {

  def apply(
    heartbeatTimeout: Option[Number] = None,
    notificationMetadata: Option[String] = None,
    notificationTargetArn: Option[String] = None,
    roleArn: Option[String] = None,
    lifecycleTransition: Option[String] = None,
    defaultResult: Option[String] = None,
    lifecycleHookName: Option[String] = None
  ): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty.Builder)
      .heartbeatTimeout(heartbeatTimeout.orNull)
      .notificationMetadata(notificationMetadata.orNull)
      .notificationTargetArn(notificationTargetArn.orNull)
      .roleArn(roleArn.orNull)
      .lifecycleTransition(lifecycleTransition.orNull)
      .defaultResult(defaultResult.orNull)
      .lifecycleHookName(lifecycleHookName.orNull)
      .build()
}
