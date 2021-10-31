package io.burkard.cdk.services.applicationautoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StepAdjustmentProperty {

  def apply(
    scalingAdjustment: Option[Number] = None,
    metricIntervalUpperBound: Option[Number] = None,
    metricIntervalLowerBound: Option[Number] = None
  ): software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepAdjustmentProperty =
    (new software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepAdjustmentProperty.Builder)
      .scalingAdjustment(scalingAdjustment.orNull)
      .metricIntervalUpperBound(metricIntervalUpperBound.orNull)
      .metricIntervalLowerBound(metricIntervalLowerBound.orNull)
      .build()
}
