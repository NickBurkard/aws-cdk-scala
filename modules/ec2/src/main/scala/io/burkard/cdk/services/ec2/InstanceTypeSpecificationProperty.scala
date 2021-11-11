package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InstanceTypeSpecificationProperty {

  def apply(
    priority: Option[Number] = None,
    availabilityZoneId: Option[String] = None,
    availabilityZone: Option[String] = None,
    instanceType: Option[String] = None,
    instancePlatform: Option[String] = None,
    weight: Option[Number] = None,
    ebsOptimized: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.InstanceTypeSpecificationProperty =
    (new software.amazon.awscdk.services.ec2.CfnCapacityReservationFleet.InstanceTypeSpecificationProperty.Builder)
      .priority(priority.orNull)
      .availabilityZoneId(availabilityZoneId.orNull)
      .availabilityZone(availabilityZone.orNull)
      .instanceType(instanceType.orNull)
      .instancePlatform(instancePlatform.orNull)
      .weight(weight.orNull)
      .ebsOptimized(ebsOptimized.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
