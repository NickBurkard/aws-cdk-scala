package io.burkard.cdk.services.groundstation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AntennaDownlinkConfigProperty {

  def apply(
    spectrumConfig: Option[software.amazon.awscdk.services.groundstation.CfnConfig.SpectrumConfigProperty] = None
  ): software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkConfigProperty =
    (new software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkConfigProperty.Builder)
      .spectrumConfig(spectrumConfig.orNull)
      .build()
}
