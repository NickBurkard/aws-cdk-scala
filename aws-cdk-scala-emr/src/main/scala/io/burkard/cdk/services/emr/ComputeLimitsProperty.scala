package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ComputeLimitsProperty {

  def apply(
    unitType: Option[String] = None,
    maximumCapacityUnits: Option[Number] = None,
    minimumCapacityUnits: Option[Number] = None,
    maximumOnDemandCapacityUnits: Option[Number] = None,
    maximumCoreCapacityUnits: Option[Number] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.ComputeLimitsProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.ComputeLimitsProperty.Builder)
      .unitType(unitType.orNull)
      .maximumCapacityUnits(maximumCapacityUnits.orNull)
      .minimumCapacityUnits(minimumCapacityUnits.orNull)
      .maximumOnDemandCapacityUnits(maximumOnDemandCapacityUnits.orNull)
      .maximumCoreCapacityUnits(maximumCoreCapacityUnits.orNull)
      .build()
}
