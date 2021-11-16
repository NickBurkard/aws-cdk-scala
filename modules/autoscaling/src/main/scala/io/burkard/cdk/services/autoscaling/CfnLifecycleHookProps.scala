package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLifecycleHookProps {

  def apply(
    lifecycleTransition: String,
    autoScalingGroupName: String,
    heartbeatTimeout: Option[Number] = None,
    notificationMetadata: Option[String] = None,
    notificationTargetArn: Option[String] = None,
    roleArn: Option[String] = None,
    defaultResult: Option[String] = None,
    lifecycleHookName: Option[String] = None
  ): software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps =
    (new software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps.Builder)
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
