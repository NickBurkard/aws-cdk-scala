package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoadBasedAutoScalingProperty {

  def apply(
    enable: Option[Boolean] = None,
    upScaling: Option[software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty] = None,
    downScaling: Option[software.amazon.awscdk.services.opsworks.CfnLayer.AutoScalingThresholdsProperty] = None
  ): software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty =
    (new software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty.Builder)
      .enable(enable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .upScaling(upScaling.orNull)
      .downScaling(downScaling.orNull)
      .build()
}
