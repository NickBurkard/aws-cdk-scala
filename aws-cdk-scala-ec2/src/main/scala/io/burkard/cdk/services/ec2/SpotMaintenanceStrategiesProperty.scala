package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SpotMaintenanceStrategiesProperty {

  def apply(
    capacityRebalance: Option[software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotCapacityRebalanceProperty] = None
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotMaintenanceStrategiesProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotMaintenanceStrategiesProperty.Builder)
      .capacityRebalance(capacityRebalance.orNull)
      .build()
}
