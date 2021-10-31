package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LifecycleHookProps {

  def apply(
    notificationMetadata: Option[String] = None,
    autoScalingGroup: Option[software.amazon.awscdk.services.autoscaling.IAutoScalingGroup] = None,
    notificationTarget: Option[software.amazon.awscdk.services.autoscaling.ILifecycleHookTarget] = None,
    lifecycleTransition: Option[software.amazon.awscdk.services.autoscaling.LifecycleTransition] = None,
    defaultResult: Option[software.amazon.awscdk.services.autoscaling.DefaultResult] = None,
    lifecycleHookName: Option[String] = None,
    heartbeatTimeout: Option[software.amazon.awscdk.Duration] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None
  ): software.amazon.awscdk.services.autoscaling.LifecycleHookProps =
    (new software.amazon.awscdk.services.autoscaling.LifecycleHookProps.Builder)
      .notificationMetadata(notificationMetadata.orNull)
      .autoScalingGroup(autoScalingGroup.orNull)
      .notificationTarget(notificationTarget.orNull)
      .lifecycleTransition(lifecycleTransition.orNull)
      .defaultResult(defaultResult.orNull)
      .lifecycleHookName(lifecycleHookName.orNull)
      .heartbeatTimeout(heartbeatTimeout.orNull)
      .role(role.orNull)
      .build()
}
