package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLifecycleHook {

  def apply(
    internalResourceId: String,
    lifecycleTransition: String,
    autoScalingGroupName: String,
    heartbeatTimeout: Option[Number] = None,
    notificationMetadata: Option[String] = None,
    notificationTargetArn: Option[String] = None,
    roleArn: Option[String] = None,
    defaultResult: Option[String] = None,
    lifecycleHookName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.autoscaling.CfnLifecycleHook =
    software.amazon.awscdk.services.autoscaling.CfnLifecycleHook.Builder
      .create(stackCtx, internalResourceId)
      .lifecycleTransition(lifecycleTransition)
      .autoScalingGroupName(autoScalingGroupName)
      .heartbeatTimeout(heartbeatTimeout.orNull)
      .notificationMetadata(notificationMetadata.orNull)
      .notificationTargetArn(notificationTargetArn.orNull)
      .roleArn(roleArn.orNull)
      .defaultResult(defaultResult.orNull)
      .lifecycleHookName(lifecycleHookName.orNull)
      .build()
}
