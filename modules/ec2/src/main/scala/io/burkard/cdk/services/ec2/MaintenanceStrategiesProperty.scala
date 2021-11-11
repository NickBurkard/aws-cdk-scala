package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MaintenanceStrategiesProperty {

  def apply(
    capacityRebalance: Option[software.amazon.awscdk.services.ec2.CfnEC2Fleet.CapacityRebalanceProperty] = None
  ): software.amazon.awscdk.services.ec2.CfnEC2Fleet.MaintenanceStrategiesProperty =
    (new software.amazon.awscdk.services.ec2.CfnEC2Fleet.MaintenanceStrategiesProperty.Builder)
      .capacityRebalance(capacityRebalance.orNull)
      .build()
}
