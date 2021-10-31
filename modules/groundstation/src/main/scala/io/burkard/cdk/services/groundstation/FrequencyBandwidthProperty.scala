package io.burkard.cdk.services.groundstation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FrequencyBandwidthProperty {

  def apply(
    units: Option[String] = None,
    value: Option[Number] = None
  ): software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyBandwidthProperty =
    (new software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyBandwidthProperty.Builder)
      .units(units.orNull)
      .value(value.orNull)
      .build()
}
