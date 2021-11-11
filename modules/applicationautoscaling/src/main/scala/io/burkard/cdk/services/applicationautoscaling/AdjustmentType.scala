package io.burkard.cdk.services.applicationautoscaling

sealed abstract class AdjustmentType(val underlying: software.amazon.awscdk.services.applicationautoscaling.AdjustmentType)
  extends Product
    with Serializable

object AdjustmentType {
  implicit def toAws(value: AdjustmentType): software.amazon.awscdk.services.applicationautoscaling.AdjustmentType =
    Option(value).map(_.underlying).orNull

  case object ChangeInCapacity
    extends AdjustmentType(software.amazon.awscdk.services.applicationautoscaling.AdjustmentType.CHANGE_IN_CAPACITY)

  case object PercentChangeInCapacity
    extends AdjustmentType(software.amazon.awscdk.services.applicationautoscaling.AdjustmentType.PERCENT_CHANGE_IN_CAPACITY)

  case object ExactCapacity
    extends AdjustmentType(software.amazon.awscdk.services.applicationautoscaling.AdjustmentType.EXACT_CAPACITY)
}
