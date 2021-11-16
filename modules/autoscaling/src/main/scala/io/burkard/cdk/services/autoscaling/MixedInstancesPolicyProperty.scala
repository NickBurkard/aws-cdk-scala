package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MixedInstancesPolicyProperty {

  def apply(
    launchTemplate: software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateProperty,
    instancesDistribution: Option[software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty] = None
  ): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.MixedInstancesPolicyProperty.Builder)
      .launchTemplate(launchTemplate)
      .instancesDistribution(instancesDistribution.orNull)
      .build()
}
