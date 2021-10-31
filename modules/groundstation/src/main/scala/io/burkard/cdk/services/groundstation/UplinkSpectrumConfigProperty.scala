package io.burkard.cdk.services.groundstation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UplinkSpectrumConfigProperty {

  def apply(
    polarization: Option[String] = None,
    centerFrequency: Option[software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyProperty] = None
  ): software.amazon.awscdk.services.groundstation.CfnConfig.UplinkSpectrumConfigProperty =
    (new software.amazon.awscdk.services.groundstation.CfnConfig.UplinkSpectrumConfigProperty.Builder)
      .polarization(polarization.orNull)
      .centerFrequency(centerFrequency.orNull)
      .build()
}
