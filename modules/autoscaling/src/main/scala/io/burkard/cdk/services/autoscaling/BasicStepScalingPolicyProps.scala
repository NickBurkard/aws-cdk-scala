package io.burkard.cdk.services.autoscaling

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BasicStepScalingPolicyProps {

  def apply(
    minAdjustmentMagnitude: Option[Number] = None,
    metricAggregationType: Option[software.amazon.awscdk.services.autoscaling.MetricAggregationType] = None,
    scalingSteps: Option[List[_ <: software.amazon.awscdk.services.autoscaling.ScalingInterval]] = None,
    cooldown: Option[software.amazon.awscdk.Duration] = None,
    metric: Option[software.amazon.awscdk.services.cloudwatch.IMetric] = None,
    estimatedInstanceWarmup: Option[software.amazon.awscdk.Duration] = None,
    adjustmentType: Option[software.amazon.awscdk.services.autoscaling.AdjustmentType] = None,
    evaluationPeriods: Option[Number] = None
  ): software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps =
    (new software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps.Builder)
      .minAdjustmentMagnitude(minAdjustmentMagnitude.orNull)
      .metricAggregationType(metricAggregationType.orNull)
      .scalingSteps(scalingSteps.map(_.asJava).orNull)
      .cooldown(cooldown.orNull)
      .metric(metric.orNull)
      .estimatedInstanceWarmup(estimatedInstanceWarmup.orNull)
      .adjustmentType(adjustmentType.orNull)
      .evaluationPeriods(evaluationPeriods.orNull)
      .build()
}
