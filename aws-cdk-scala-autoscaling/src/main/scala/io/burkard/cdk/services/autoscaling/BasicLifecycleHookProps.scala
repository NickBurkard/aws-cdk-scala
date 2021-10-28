package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BasicLifecycleHookProps {

  def apply(
    notificationMetadata: Option[String] = None,
    notificationTarget: Option[software.amazon.awscdk.services.autoscaling.ILifecycleHookTarget] = None,
    lifecycleTransition: Option[software.amazon.awscdk.services.autoscaling.LifecycleTransition] = None,
    defaultResult: Option[software.amazon.awscdk.services.autoscaling.DefaultResult] = None,
    lifecycleHookName: Option[String] = None,
    heartbeatTimeout: Option[software.amazon.awscdk.Duration] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None
  ): software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps =
    (new software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps.Builder)
      .notificationMetadata(notificationMetadata.orNull)
      .notificationTarget(notificationTarget.orNull)
      .lifecycleTransition(lifecycleTransition.orNull)
      .defaultResult(defaultResult.orNull)
      .lifecycleHookName(lifecycleHookName.orNull)
      .heartbeatTimeout(heartbeatTimeout.orNull)
      .role(role.orNull)
      .build()
}
