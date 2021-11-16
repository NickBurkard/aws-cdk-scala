package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PredictiveScalingMetricSpecificationProperty {

  def apply(
    targetValue: Number,
    predefinedScalingMetricSpecification: Option[software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty] = None,
    predefinedLoadMetricSpecification: Option[software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty] = None,
    predefinedMetricPairSpecification: Option[software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty] = None
  ): software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty.Builder)
      .targetValue(targetValue)
      .predefinedScalingMetricSpecification(predefinedScalingMetricSpecification.orNull)
      .predefinedLoadMetricSpecification(predefinedLoadMetricSpecification.orNull)
      .predefinedMetricPairSpecification(predefinedMetricPairSpecification.orNull)
      .build()
}
