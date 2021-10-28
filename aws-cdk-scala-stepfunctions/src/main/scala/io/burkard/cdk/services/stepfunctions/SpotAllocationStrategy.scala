package io.burkard.cdk.services.stepfunctions

sealed abstract class SpotAllocationStrategy(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy)
  extends Product
    with Serializable

object SpotAllocationStrategy {
  implicit def toAws(value: SpotAllocationStrategy): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy =
    Option(value).map(_.underlying).orNull

  case object CapacityOptimized
    extends SpotAllocationStrategy(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.SpotAllocationStrategy.CAPACITY_OPTIMIZED)
}
