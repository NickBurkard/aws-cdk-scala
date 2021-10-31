package io.burkard.cdk.services.applicationautoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StepScalingAction {

  def apply(
    internalResourceId: String,
    minAdjustmentMagnitude: Option[Number] = None,
    metricAggregationType: Option[software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType] = None,
    policyName: Option[String] = None,
    scalingTarget: Option[software.amazon.awscdk.services.applicationautoscaling.IScalableTarget] = None,
    cooldown: Option[software.amazon.awscdk.Duration] = None,
    adjustmentType: Option[software.amazon.awscdk.services.applicationautoscaling.AdjustmentType] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.applicationautoscaling.StepScalingAction =
    software.amazon.awscdk.services.applicationautoscaling.StepScalingAction.Builder
      .create(stackCtx, internalResourceId)
      .minAdjustmentMagnitude(minAdjustmentMagnitude.orNull)
      .metricAggregationType(metricAggregationType.orNull)
      .policyName(policyName.orNull)
      .scalingTarget(scalingTarget.orNull)
      .cooldown(cooldown.orNull)
      .adjustmentType(adjustmentType.orNull)
      .build()
}
