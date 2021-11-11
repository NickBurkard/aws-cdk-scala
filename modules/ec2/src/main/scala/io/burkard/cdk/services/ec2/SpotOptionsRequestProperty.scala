package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SpotOptionsRequestProperty {

  def apply(
    minTargetCapacity: Option[Number] = None,
    allocationStrategy: Option[String] = None,
    instanceInterruptionBehavior: Option[String] = None,
    instancePoolsToUseCount: Option[Number] = None,
    maintenanceStrategies: Option[software.amazon.awscdk.services.ec2.CfnEC2Fleet.MaintenanceStrategiesProperty] = None,
    maxTotalPrice: Option[String] = None,
    singleInstanceType: Option[Boolean] = None,
    singleAvailabilityZone: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.CfnEC2Fleet.SpotOptionsRequestProperty =
    (new software.amazon.awscdk.services.ec2.CfnEC2Fleet.SpotOptionsRequestProperty.Builder)
      .minTargetCapacity(minTargetCapacity.orNull)
      .allocationStrategy(allocationStrategy.orNull)
      .instanceInterruptionBehavior(instanceInterruptionBehavior.orNull)
      .instancePoolsToUseCount(instancePoolsToUseCount.orNull)
      .maintenanceStrategies(maintenanceStrategies.orNull)
      .maxTotalPrice(maxTotalPrice.orNull)
      .singleInstanceType(singleInstanceType.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .singleAvailabilityZone(singleAvailabilityZone.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
