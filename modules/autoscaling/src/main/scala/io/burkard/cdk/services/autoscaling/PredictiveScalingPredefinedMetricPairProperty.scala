package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PredictiveScalingPredefinedMetricPairProperty {

  def apply(
    predefinedMetricType: Option[String] = None,
    resourceLabel: Option[String] = None
  ): software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty.Builder)
      .predefinedMetricType(predefinedMetricType.orNull)
      .resourceLabel(resourceLabel.orNull)
      .build()
}
