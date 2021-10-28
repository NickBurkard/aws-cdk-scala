package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MixedInstancesPolicyProperty {

  def apply(
    launchTemplate: Option[software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateProperty] = None,
    instancesDistribution: Option[software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty] = None
  ): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty.Builder)
      .launchTemplate(launchTemplate.orNull)
      .instancesDistribution(instancesDistribution.orNull)
      .build()
}
