package io.burkard.cdk.services.groundstation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SpectrumConfigProperty {

  def apply(
    polarization: Option[String] = None,
    bandwidth: Option[software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyBandwidthProperty] = None,
    centerFrequency: Option[software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyProperty] = None
  ): software.amazon.awscdk.services.groundstation.CfnConfig.SpectrumConfigProperty =
    (new software.amazon.awscdk.services.groundstation.CfnConfig.SpectrumConfigProperty.Builder)
      .polarization(polarization.orNull)
      .bandwidth(bandwidth.orNull)
      .centerFrequency(centerFrequency.orNull)
      .build()
}
