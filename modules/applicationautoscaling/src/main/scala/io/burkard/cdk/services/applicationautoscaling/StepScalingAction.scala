package io.burkard.cdk.services.applicationautoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StepScalingAction {

  def apply(
    internalResourceId: String,
    scalingTarget: software.amazon.awscdk.services.applicationautoscaling.IScalableTarget,
    minAdjustmentMagnitude: Option[Number] = None,
    metricAggregationType: Option[software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType] = None,
    policyName: Option[String] = None,
    cooldown: Option[software.amazon.awscdk.Duration] = None,
    adjustmentType: Option[software.amazon.awscdk.services.applicationautoscaling.AdjustmentType] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.applicationautoscaling.StepScalingAction =
    software.amazon.awscdk.services.applicationautoscaling.StepScalingAction.Builder
      .create(stackCtx, internalResourceId)
      .scalingTarget(scalingTarget)
      .minAdjustmentMagnitude(minAdjustmentMagnitude.orNull)
      .metricAggregationType(metricAggregationType.orNull)
      .policyName(policyName.orNull)
      .cooldown(cooldown.orNull)
      .adjustmentType(adjustmentType.orNull)
      .build()
}
