package io.burkard.cdk.services.stepfunctions

sealed abstract class ScalingAdjustmentType(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingAdjustmentType)
  extends Product
    with Serializable

object ScalingAdjustmentType {
  implicit def toAws(value: ScalingAdjustmentType): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingAdjustmentType =
    Option(value).map(_.underlying).orNull

  case object ChangeInCapacity
    extends ScalingAdjustmentType(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingAdjustmentType.CHANGE_IN_CAPACITY)

  case object PercentChangeInCapacity
    extends ScalingAdjustmentType(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingAdjustmentType.PERCENT_CHANGE_IN_CAPACITY)

  case object ExactCapacity
    extends ScalingAdjustmentType(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.ScalingAdjustmentType.EXACT_CAPACITY)
}
