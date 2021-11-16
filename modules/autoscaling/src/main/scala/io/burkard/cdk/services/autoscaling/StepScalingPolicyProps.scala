package io.burkard.cdk.services.autoscaling

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StepScalingPolicyProps {

  def apply(
    autoScalingGroup: software.amazon.awscdk.services.autoscaling.IAutoScalingGroup,
    minAdjustmentMagnitude: Option[Number] = None,
    metricAggregationType: Option[software.amazon.awscdk.services.autoscaling.MetricAggregationType] = None,
    scalingSteps: Option[List[_ <: software.amazon.awscdk.services.autoscaling.ScalingInterval]] = None,
    cooldown: Option[software.amazon.awscdk.Duration] = None,
    metric: Option[software.amazon.awscdk.services.cloudwatch.IMetric] = None,
    estimatedInstanceWarmup: Option[software.amazon.awscdk.Duration] = None,
    adjustmentType: Option[software.amazon.awscdk.services.autoscaling.AdjustmentType] = None,
    evaluationPeriods: Option[Number] = None
  ): software.amazon.awscdk.services.autoscaling.StepScalingPolicyProps =
    (new software.amazon.awscdk.services.autoscaling.StepScalingPolicyProps.Builder)
      .autoScalingGroup(autoScalingGroup)
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
