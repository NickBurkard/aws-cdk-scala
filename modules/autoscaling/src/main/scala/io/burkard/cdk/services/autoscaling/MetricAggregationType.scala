package io.burkard.cdk.services.autoscaling


sealed abstract class MetricAggregationType(val underlying: software.amazon.awscdk.services.autoscaling.MetricAggregationType)
  extends Product
    with Serializable


object MetricAggregationType {
  implicit def toAws(value: MetricAggregationType): software.amazon.awscdk.services.autoscaling.MetricAggregationType =
    Option(value).map(_.underlying).orNull

  case object Average
    extends MetricAggregationType(software.amazon.awscdk.services.autoscaling.MetricAggregationType.AVERAGE)

  case object Minimum
    extends MetricAggregationType(software.amazon.awscdk.services.autoscaling.MetricAggregationType.MINIMUM)

  case object Maximum
    extends MetricAggregationType(software.amazon.awscdk.services.autoscaling.MetricAggregationType.MAXIMUM)
}
