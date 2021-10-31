package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AacSettingsProperty {

  def apply(
    vbrQuality: Option[String] = None,
    sampleRate: Option[Number] = None,
    rateControlMode: Option[String] = None,
    profile: Option[String] = None,
    spec: Option[String] = None,
    rawFormat: Option[String] = None,
    inputType: Option[String] = None,
    bitrate: Option[Number] = None,
    codingMode: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.AacSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.AacSettingsProperty.Builder)
      .vbrQuality(vbrQuality.orNull)
      .sampleRate(sampleRate.orNull)
      .rateControlMode(rateControlMode.orNull)
      .profile(profile.orNull)
      .spec(spec.orNull)
      .rawFormat(rawFormat.orNull)
      .inputType(inputType.orNull)
      .bitrate(bitrate.orNull)
      .codingMode(codingMode.orNull)
      .build()
}
