package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TargetTrackingConfigurationProperty {

  def apply(
    disableScaleIn: Option[Boolean] = None,
    customizedMetricSpecification: Option[software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty] = None,
    targetValue: Option[Number] = None,
    predefinedMetricSpecification: Option[software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty] = None
  ): software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty.Builder)
      .disableScaleIn(disableScaleIn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .customizedMetricSpecification(customizedMetricSpecification.orNull)
      .targetValue(targetValue.orNull)
      .predefinedMetricSpecification(predefinedMetricSpecification.orNull)
      .build()
}
