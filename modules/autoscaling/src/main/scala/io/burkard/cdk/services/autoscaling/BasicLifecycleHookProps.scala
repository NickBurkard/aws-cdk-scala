package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BasicLifecycleHookProps {

  def apply(
    notificationTarget: software.amazon.awscdk.services.autoscaling.ILifecycleHookTarget,
    lifecycleTransition: software.amazon.awscdk.services.autoscaling.LifecycleTransition,
    notificationMetadata: Option[String] = None,
    defaultResult: Option[software.amazon.awscdk.services.autoscaling.DefaultResult] = None,
    lifecycleHookName: Option[String] = None,
    heartbeatTimeout: Option[software.amazon.awscdk.Duration] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None
  ): software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps =
    (new software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps.Builder)
      .notificationTarget(notificationTarget)
      .lifecycleTransition(lifecycleTransition)
      .notificationMetadata(notificationMetadata.orNull)
      .defaultResult(defaultResult.orNull)
      .lifecycleHookName(lifecycleHookName.orNull)
      .heartbeatTimeout(heartbeatTimeout.orNull)
      .role(role.orNull)
      .build()
}
