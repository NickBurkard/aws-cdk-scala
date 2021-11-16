package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PredictiveScalingPredefinedMetricPairProperty {

  def apply(
    predefinedMetricType: String,
    resourceLabel: Option[String] = None
  ): software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty.Builder)
      .predefinedMetricType(predefinedMetricType)
      .resourceLabel(resourceLabel.orNull)
      .build()
}
