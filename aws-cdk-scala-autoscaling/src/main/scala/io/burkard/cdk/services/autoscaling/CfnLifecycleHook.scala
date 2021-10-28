package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLifecycleHook {

  def apply(
    internalResourceId: String,
    heartbeatTimeout: Option[Number] = None,
    notificationMetadata: Option[String] = None,
    notificationTargetArn: Option[String] = None,
    roleArn: Option[String] = None,
    lifecycleTransition: Option[String] = None,
    defaultResult: Option[String] = None,
    autoScalingGroupName: Option[String] = None,
    lifecycleHookName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.autoscaling.CfnLifecycleHook =
    software.amazon.awscdk.services.autoscaling.CfnLifecycleHook.Builder
      .create(stackCtx, internalResourceId)
      .heartbeatTimeout(heartbeatTimeout.orNull)
      .notificationMetadata(notificationMetadata.orNull)
      .notificationTargetArn(notificationTargetArn.orNull)
      .roleArn(roleArn.orNull)
      .lifecycleTransition(lifecycleTransition.orNull)
      .defaultResult(defaultResult.orNull)
      .autoScalingGroupName(autoScalingGroupName.orNull)
      .lifecycleHookName(lifecycleHookName.orNull)
      .build()
}
