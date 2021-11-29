package io.burkard.cdk.services.autoscaling

sealed abstract class AdjustmentType(val underlying: software.amazon.awscdk.services.autoscaling.AdjustmentType)
  extends Product
    with Serializable

object AdjustmentType {
  implicit def toAws(value: AdjustmentType): software.amazon.awscdk.services.autoscaling.AdjustmentType =
    Option(value).map(_.underlying).orNull

  case object ChangeInCapacity
    extends AdjustmentType(software.amazon.awscdk.services.autoscaling.AdjustmentType.CHANGE_IN_CAPACITY)

  case object ExactCapacity
    extends AdjustmentType(software.amazon.awscdk.services.autoscaling.AdjustmentType.EXACT_CAPACITY)

  case object PercentChangeInCapacity
    extends AdjustmentType(software.amazon.awscdk.services.autoscaling.AdjustmentType.PERCENT_CHANGE_IN_CAPACITY)
}
