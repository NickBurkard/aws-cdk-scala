package io.burkard.cdk.services.autoscaling

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BasicStepScalingPolicyProps {

  def apply(
    scalingSteps: List[_ <: software.amazon.awscdk.services.autoscaling.ScalingInterval],
    metric: software.amazon.awscdk.services.cloudwatch.IMetric,
    minAdjustmentMagnitude: Option[Number] = None,
    metricAggregationType: Option[software.amazon.awscdk.services.autoscaling.MetricAggregationType] = None,
    cooldown: Option[software.amazon.awscdk.Duration] = None,
    estimatedInstanceWarmup: Option[software.amazon.awscdk.Duration] = None,
    adjustmentType: Option[software.amazon.awscdk.services.autoscaling.AdjustmentType] = None,
    evaluationPeriods: Option[Number] = None
  ): software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps =
    (new software.amazon.awscdk.services.autoscaling.BasicStepScalingPolicyProps.Builder)
      .scalingSteps(scalingSteps.asJava)
      .metric(metric)
      .minAdjustmentMagnitude(minAdjustmentMagnitude.orNull)
      .metricAggregationType(metricAggregationType.orNull)
      .cooldown(cooldown.orNull)
      .estimatedInstanceWarmup(estimatedInstanceWarmup.orNull)
      .adjustmentType(adjustmentType.orNull)
      .evaluationPeriods(evaluationPeriods.orNull)
      .build()
}
