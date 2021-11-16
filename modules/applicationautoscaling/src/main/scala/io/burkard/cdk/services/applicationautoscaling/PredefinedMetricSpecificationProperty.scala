package io.burkard.cdk.services.applicationautoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PredefinedMetricSpecificationProperty {

  def apply(
    predefinedMetricType: String,
    resourceLabel: Option[String] = None
  ): software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty =
    (new software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty.Builder)
      .predefinedMetricType(predefinedMetricType)
      .resourceLabel(resourceLabel.orNull)
      .build()
}
