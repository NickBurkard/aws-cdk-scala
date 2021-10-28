package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LaunchTemplateOverridesProperty {

  def apply(
    weightedCapacity: Option[String] = None,
    launchTemplateSpecification: Option[software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateSpecificationProperty] = None,
    instanceType: Option[String] = None
  ): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateOverridesProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.LaunchTemplateOverridesProperty.Builder)
      .weightedCapacity(weightedCapacity.orNull)
      .launchTemplateSpecification(launchTemplateSpecification.orNull)
      .instanceType(instanceType.orNull)
      .build()
}
