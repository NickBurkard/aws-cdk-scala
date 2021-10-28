package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CapacityReservationSpecificationProperty {

  def apply(
    capacityReservationTarget: Option[software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationTargetProperty] = None,
    capacityReservationPreference: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationSpecificationProperty =
    (new software.amazon.awscdk.services.ec2.CfnLaunchTemplate.CapacityReservationSpecificationProperty.Builder)
      .capacityReservationTarget(capacityReservationTarget.orNull)
      .capacityReservationPreference(capacityReservationPreference.orNull)
      .build()
}
