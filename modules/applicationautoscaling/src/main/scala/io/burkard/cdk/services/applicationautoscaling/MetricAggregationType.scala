package io.burkard.cdk.services.applicationautoscaling

sealed abstract class MetricAggregationType(val underlying: software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType)
  extends Product
    with Serializable

object MetricAggregationType {
  implicit def toAws(value: MetricAggregationType): software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType =
    Option(value).map(_.underlying).orNull

  case object Average
    extends MetricAggregationType(software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType.AVERAGE)

  case object Maximum
    extends MetricAggregationType(software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType.MAXIMUM)

  case object Minimum
    extends MetricAggregationType(software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType.MINIMUM)
}
