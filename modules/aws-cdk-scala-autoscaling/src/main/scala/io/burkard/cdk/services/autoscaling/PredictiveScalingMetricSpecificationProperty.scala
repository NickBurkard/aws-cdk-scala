package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PredictiveScalingMetricSpecificationProperty {

  def apply(
    predefinedScalingMetricSpecification: Option[software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty] = None,
    predefinedLoadMetricSpecification: Option[software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty] = None,
    predefinedMetricPairSpecification: Option[software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty] = None,
    targetValue: Option[Number] = None
  ): software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty.Builder)
      .predefinedScalingMetricSpecification(predefinedScalingMetricSpecification.orNull)
      .predefinedLoadMetricSpecification(predefinedLoadMetricSpecification.orNull)
      .predefinedMetricPairSpecification(predefinedMetricPairSpecification.orNull)
      .targetValue(targetValue.orNull)
      .build()
}
