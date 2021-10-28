package io.burkard.cdk.services.groundstation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AntennaDownlinkConfigProperty {

  def apply(
    spectrumConfig: Option[software.amazon.awscdk.services.groundstation.CfnConfig.SpectrumConfigProperty] = None
  ): software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkConfigProperty =
    (new software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkConfigProperty.Builder)
      .spectrumConfig(spectrumConfig.orNull)
      .build()
}
