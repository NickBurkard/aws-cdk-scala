package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StepScalingAction {

  def apply(
    internalResourceId: String,
    autoScalingGroup: software.amazon.awscdk.services.autoscaling.IAutoScalingGroup,
    minAdjustmentMagnitude: Option[Number] = None,
    metricAggregationType: Option[software.amazon.awscdk.services.autoscaling.MetricAggregationType] = None,
    cooldown: Option[software.amazon.awscdk.Duration] = None,
    estimatedInstanceWarmup: Option[software.amazon.awscdk.Duration] = None,
    adjustmentType: Option[software.amazon.awscdk.services.autoscaling.AdjustmentType] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.autoscaling.StepScalingAction =
    software.amazon.awscdk.services.autoscaling.StepScalingAction.Builder
      .create(stackCtx, internalResourceId)
      .autoScalingGroup(autoScalingGroup)
      .minAdjustmentMagnitude(minAdjustmentMagnitude.orNull)
      .metricAggregationType(metricAggregationType.orNull)
      .cooldown(cooldown.orNull)
      .estimatedInstanceWarmup(estimatedInstanceWarmup.orNull)
      .adjustmentType(adjustmentType.orNull)
      .build()
}
