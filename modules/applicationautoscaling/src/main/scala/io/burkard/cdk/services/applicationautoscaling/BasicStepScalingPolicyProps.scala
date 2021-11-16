package io.burkard.cdk.services.applicationautoscaling

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BasicStepScalingPolicyProps {

  def apply(
    scalingSteps: List[_ <: software.amazon.awscdk.services.applicationautoscaling.ScalingInterval],
    metric: software.amazon.awscdk.services.cloudwatch.IMetric,
    minAdjustmentMagnitude: Option[Number] = None,
    metricAggregationType: Option[software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType] = None,
    cooldown: Option[software.amazon.awscdk.Duration] = None,
    adjustmentType: Option[software.amazon.awscdk.services.applicationautoscaling.AdjustmentType] = None,
    evaluationPeriods: Option[Number] = None
  ): software.amazon.awscdk.services.applicationautoscaling.BasicStepScalingPolicyProps =
    (new software.amazon.awscdk.services.applicationautoscaling.BasicStepScalingPolicyProps.Builder)
      .scalingSteps(scalingSteps.asJava)
      .metric(metric)
      .minAdjustmentMagnitude(minAdjustmentMagnitude.orNull)
      .metricAggregationType(metricAggregationType.orNull)
      .cooldown(cooldown.orNull)
      .adjustmentType(adjustmentType.orNull)
      .evaluationPeriods(evaluationPeriods.orNull)
      .build()
}
