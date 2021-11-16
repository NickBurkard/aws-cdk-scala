package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TargetTrackingConfigurationProperty {

  def apply(
    targetValue: Number,
    disableScaleIn: Option[Boolean] = None,
    customizedMetricSpecification: Option[software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty] = None,
    predefinedMetricSpecification: Option[software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty] = None
  ): software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty.Builder)
      .targetValue(targetValue)
      .disableScaleIn(disableScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .customizedMetricSpecification(customizedMetricSpecification.orNull)
      .predefinedMetricSpecification(predefinedMetricSpecification.orNull)
      .build()
}
