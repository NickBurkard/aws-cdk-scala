package io.burkard.cdk.services.applicationautoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnScalingPolicyProps {

  def apply(
    serviceNamespace: Option[String] = None,
    policyName: Option[String] = None,
    policyType: Option[String] = None,
    stepScalingPolicyConfiguration: Option[software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty] = None,
    scalableDimension: Option[String] = None,
    resourceId: Option[String] = None,
    scalingTargetId: Option[String] = None,
    targetTrackingScalingPolicyConfiguration: Option[software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty] = None
  ): software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps =
    (new software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps.Builder)
      .serviceNamespace(serviceNamespace.orNull)
      .policyName(policyName.orNull)
      .policyType(policyType.orNull)
      .stepScalingPolicyConfiguration(stepScalingPolicyConfiguration.orNull)
      .scalableDimension(scalableDimension.orNull)
      .resourceId(resourceId.orNull)
      .scalingTargetId(scalingTargetId.orNull)
      .targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration.orNull)
      .build()
}
