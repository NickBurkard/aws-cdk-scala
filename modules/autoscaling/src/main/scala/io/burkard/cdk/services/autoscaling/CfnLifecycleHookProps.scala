package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLifecycleHookProps {

  def apply(
    heartbeatTimeout: Option[Number] = None,
    notificationMetadata: Option[String] = None,
    notificationTargetArn: Option[String] = None,
    roleArn: Option[String] = None,
    lifecycleTransition: Option[String] = None,
    defaultResult: Option[String] = None,
    autoScalingGroupName: Option[String] = None,
    lifecycleHookName: Option[String] = None
  ): software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps =
    (new software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps.Builder)
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
