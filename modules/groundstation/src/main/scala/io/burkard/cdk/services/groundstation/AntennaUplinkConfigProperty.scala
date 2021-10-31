package io.burkard.cdk.services.groundstation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AntennaUplinkConfigProperty {

  def apply(
    spectrumConfig: Option[software.amazon.awscdk.services.groundstation.CfnConfig.UplinkSpectrumConfigProperty] = None,
    targetEirp: Option[software.amazon.awscdk.services.groundstation.CfnConfig.EirpProperty] = None,
    transmitDisabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.groundstation.CfnConfig.AntennaUplinkConfigProperty =
    (new software.amazon.awscdk.services.groundstation.CfnConfig.AntennaUplinkConfigProperty.Builder)
      .spectrumConfig(spectrumConfig.orNull)
      .targetEirp(targetEirp.orNull)
      .transmitDisabled(transmitDisabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
