package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LifecycleHook {

  def apply(
    internalResourceId: String,
    autoScalingGroup: software.amazon.awscdk.services.autoscaling.IAutoScalingGroup,
    notificationMetadata: Option[String] = None,
    notificationTarget: Option[software.amazon.awscdk.services.autoscaling.ILifecycleHookTarget] = None,
    lifecycleTransition: Option[software.amazon.awscdk.services.autoscaling.LifecycleTransition] = None,
    defaultResult: Option[software.amazon.awscdk.services.autoscaling.DefaultResult] = None,
    lifecycleHookName: Option[String] = None,
    heartbeatTimeout: Option[software.amazon.awscdk.Duration] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.autoscaling.LifecycleHook =
    software.amazon.awscdk.services.autoscaling.LifecycleHook.Builder
      .create(stackCtx, internalResourceId)
      .autoScalingGroup(autoScalingGroup)
      .notificationMetadata(notificationMetadata.orNull)
      .notificationTarget(notificationTarget.orNull)
      .lifecycleTransition(lifecycleTransition.orNull)
      .defaultResult(defaultResult.orNull)
      .lifecycleHookName(lifecycleHookName.orNull)
      .heartbeatTimeout(heartbeatTimeout.orNull)
      .role(role.orNull)
      .build()
}
