package io.burkard.cdk.services.applicationautoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnScalingPolicy {

  def apply(
    internalResourceId: String,
    policyName: String,
    policyType: String,
    serviceNamespace: Option[String] = None,
    stepScalingPolicyConfiguration: Option[software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty] = None,
    scalableDimension: Option[String] = None,
    resourceId: Option[String] = None,
    scalingTargetId: Option[String] = None,
    targetTrackingScalingPolicyConfiguration: Option[software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy =
    software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.Builder
      .create(stackCtx, internalResourceId)
      .policyName(policyName)
      .policyType(policyType)
      .serviceNamespace(serviceNamespace.orNull)
      .stepScalingPolicyConfiguration(stepScalingPolicyConfiguration.orNull)
      .scalableDimension(scalableDimension.orNull)
      .resourceId(resourceId.orNull)
      .scalingTargetId(scalingTargetId.orNull)
      .targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration.orNull)
      .build()
}
