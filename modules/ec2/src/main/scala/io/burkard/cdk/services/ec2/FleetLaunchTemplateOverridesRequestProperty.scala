package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FleetLaunchTemplateOverridesRequestProperty {

  def apply(
    priority: Option[Number] = None,
    availabilityZone: Option[String] = None,
    subnetId: Option[String] = None,
    instanceType: Option[String] = None,
    placement: Option[software.amazon.awscdk.services.ec2.CfnEC2Fleet.PlacementProperty] = None,
    maxPrice: Option[String] = None,
    weightedCapacity: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateOverridesRequestProperty =
    (new software.amazon.awscdk.services.ec2.CfnEC2Fleet.FleetLaunchTemplateOverridesRequestProperty.Builder)
      .priority(priority.orNull)
      .availabilityZone(availabilityZone.orNull)
      .subnetId(subnetId.orNull)
      .instanceType(instanceType.orNull)
      .placement(placement.orNull)
      .maxPrice(maxPrice.orNull)
      .weightedCapacity(weightedCapacity.orNull)
      .build()
}
