package io.burkard.cdk.services.groundstation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AntennaDownlinkDemodDecodeConfigProperty {

  def apply(
    spectrumConfig: Option[software.amazon.awscdk.services.groundstation.CfnConfig.SpectrumConfigProperty] = None,
    demodulationConfig: Option[software.amazon.awscdk.services.groundstation.CfnConfig.DemodulationConfigProperty] = None,
    decodeConfig: Option[software.amazon.awscdk.services.groundstation.CfnConfig.DecodeConfigProperty] = None
  ): software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkDemodDecodeConfigProperty =
    (new software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkDemodDecodeConfigProperty.Builder)
      .spectrumConfig(spectrumConfig.orNull)
      .demodulationConfig(demodulationConfig.orNull)
      .decodeConfig(decodeConfig.orNull)
      .build()
}
