package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StepScalingAction {

  def apply(
    internalResourceId: String,
    minAdjustmentMagnitude: Option[Number] = None,
    metricAggregationType: Option[software.amazon.awscdk.services.autoscaling.MetricAggregationType] = None,
    autoScalingGroup: Option[software.amazon.awscdk.services.autoscaling.IAutoScalingGroup] = None,
    cooldown: Option[software.amazon.awscdk.Duration] = None,
    estimatedInstanceWarmup: Option[software.amazon.awscdk.Duration] = None,
    adjustmentType: Option[software.amazon.awscdk.services.autoscaling.AdjustmentType] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.autoscaling.StepScalingAction =
    software.amazon.awscdk.services.autoscaling.StepScalingAction.Builder
      .create(stackCtx, internalResourceId)
      .minAdjustmentMagnitude(minAdjustmentMagnitude.orNull)
      .metricAggregationType(metricAggregationType.orNull)
      .autoScalingGroup(autoScalingGroup.orNull)
      .cooldown(cooldown.orNull)
      .estimatedInstanceWarmup(estimatedInstanceWarmup.orNull)
      .adjustmentType(adjustmentType.orNull)
      .build()
}