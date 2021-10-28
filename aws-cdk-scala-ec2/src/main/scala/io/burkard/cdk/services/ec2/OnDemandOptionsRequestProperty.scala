package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OnDemandOptionsRequestProperty {

  def apply(
    allocationStrategy: Option[String] = None,
    maxTotalPrice: Option[String] = None,
    capacityReservationOptions: Option[software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityReservationOptionsRequestProperty] = None,
    minTargetCapacity: Option[Number] = None,
    singleInstanceType: Option[Boolean] = None,
    singleAvailabilityZone: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.CfnEC2Fleet.OnDemandOptionsRequestProperty =
    (new software.amazon.awscdk.services.ec2.CfnEC2Fleet.OnDemandOptionsRequestProperty.Builder)
      .allocationStrategy(allocationStrategy.orNull)
      .maxTotalPrice(maxTotalPrice.orNull)
      .capacityReservationOptions(capacityReservationOptions.orNull)
      .minTargetCapacity(minTargetCapacity.orNull)
      .singleInstanceType(singleInstanceType.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .singleAvailabilityZone(singleAvailabilityZone.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
