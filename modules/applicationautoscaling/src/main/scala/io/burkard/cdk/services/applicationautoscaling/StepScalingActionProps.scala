package io.burkard.cdk.services.applicationautoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StepScalingActionProps {

  def apply(
    scalingTarget: software.amazon.awscdk.services.applicationautoscaling.IScalableTarget,
    minAdjustmentMagnitude: Option[Number] = None,
    metricAggregationType: Option[software.amazon.awscdk.services.applicationautoscaling.MetricAggregationType] = None,
    policyName: Option[String] = None,
    cooldown: Option[software.amazon.awscdk.Duration] = None,
    adjustmentType: Option[software.amazon.awscdk.services.applicationautoscaling.AdjustmentType] = None
  ): software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps =
    (new software.amazon.awscdk.services.applicationautoscaling.StepScalingActionProps.Builder)
      .scalingTarget(scalingTarget)
      .minAdjustmentMagnitude(minAdjustmentMagnitude.orNull)
      .metricAggregationType(metricAggregationType.orNull)
      .policyName(policyName.orNull)
      .cooldown(cooldown.orNull)
      .adjustmentType(adjustmentType.orNull)
      .build()
}
