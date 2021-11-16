package io.burkard.cdk.services.emr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ComputeLimitsProperty {

  def apply(
    unitType: String,
    maximumCapacityUnits: Number,
    minimumCapacityUnits: Number,
    maximumOnDemandCapacityUnits: Option[Number] = None,
    maximumCoreCapacityUnits: Option[Number] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.ComputeLimitsProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.ComputeLimitsProperty.Builder)
      .unitType(unitType)
      .maximumCapacityUnits(maximumCapacityUnits)
      .minimumCapacityUnits(minimumCapacityUnits)
      .maximumOnDemandCapacityUnits(maximumOnDemandCapacityUnits.orNull)
      .maximumCoreCapacityUnits(maximumCoreCapacityUnits.orNull)
      .build()
}
