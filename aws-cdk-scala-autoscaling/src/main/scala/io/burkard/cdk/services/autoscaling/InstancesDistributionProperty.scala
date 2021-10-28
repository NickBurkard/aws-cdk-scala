package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InstancesDistributionProperty {

  def apply(
    onDemandAllocationStrategy: Option[String] = None,
    spotMaxPrice: Option[String] = None,
    spotAllocationStrategy: Option[String] = None,
    onDemandBaseCapacity: Option[Number] = None,
    onDemandPercentageAboveBaseCapacity: Option[Number] = None,
    spotInstancePools: Option[Number] = None
  ): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.InstancesDistributionProperty.Builder)
      .onDemandAllocationStrategy(onDemandAllocationStrategy.orNull)
      .spotMaxPrice(spotMaxPrice.orNull)
      .spotAllocationStrategy(spotAllocationStrategy.orNull)
      .onDemandBaseCapacity(onDemandBaseCapacity.orNull)
      .onDemandPercentageAboveBaseCapacity(onDemandPercentageAboveBaseCapacity.orNull)
      .spotInstancePools(spotInstancePools.orNull)
      .build()
}
