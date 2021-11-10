package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LaunchTemplateOverridesProperty {

  def apply(
    availabilityZone: Option[String] = None,
    subnetId: Option[String] = None,
    instanceType: Option[String] = None,
    instanceRequirements: Option[software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceRequirementsRequestProperty] = None,
    weightedCapacity: Option[Number] = None,
    spotPrice: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateOverridesProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.LaunchTemplateOverridesProperty.Builder)
      .availabilityZone(availabilityZone.orNull)
      .subnetId(subnetId.orNull)
      .instanceType(instanceType.orNull)
      .instanceRequirements(instanceRequirements.orNull)
      .weightedCapacity(weightedCapacity.orNull)
      .spotPrice(spotPrice.orNull)
      .build()
}
