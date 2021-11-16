package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LifecycleHookSpecificationProperty {

  def apply(
    lifecycleTransition: String,
    lifecycleHookName: String,
    heartbeatTimeout: Option[Number] = None,
    notificationMetadata: Option[String] = None,
    notificationTargetArn: Option[String] = None,
    roleArn: Option[String] = None,
    defaultResult: Option[String] = None
  ): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LifecycleHookSpecificationProperty.Builder)
      .lifecycleTransition(lifecycleTransition)
      .lifecycleHookName(lifecycleHookName)
      .heartbeatTimeout(heartbeatTimeout.orNull)
      .notificationMetadata(notificationMetadata.orNull)
      .notificationTargetArn(notificationTargetArn.orNull)
      .roleArn(roleArn.orNull)
      .defaultResult(defaultResult.orNull)
      .build()
}
