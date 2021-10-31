package io.burkard.cdk.services.applicationautoscaling

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StepScalingPolicyProps {

  def apply(
    minAdjustmentMagnitude: Option[Number] = None,
    metricAggregationType: Option[software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType] = None,
    scalingSteps: Option[List[_ <: software.amazon.awscdk.services.applicationautoscaling.ScalingInterval]] = None,
    scalingTarget: Option[software.amazon.awscdk.services.applicationautoscaling.IScalableTarget] = None,
    cooldown: Option[software.amazon.awscdk.Duration] = None,
    metric: Option[software.amazon.awscdk.services.cloudwatch.IMetric] = None,
    adjustmentType: Option[software.amazon.awscdk.services.applicationautoscaling.AdjustmentType] = None,
    evaluationPeriods: Option[Number] = None
  ): software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps =
    (new software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicyProps.Builder)
      .minAdjustmentMagnitude(minAdjustmentMagnitude.orNull)
      .metricAggregationType(metricAggregationType.orNull)
      .scalingSteps(scalingSteps.map(_.asJava).orNull)
      .scalingTarget(scalingTarget.orNull)
      .cooldown(cooldown.orNull)
      .metric(metric.orNull)
      .adjustmentType(adjustmentType.orNull)
      .evaluationPeriods(evaluationPeriods.orNull)
      .build()
}
