package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Hdr10SettingsProperty {

  def apply(
    maxCll: Option[Number] = None,
    maxFall: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.Hdr10SettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.Hdr10SettingsProperty.Builder)
      .maxCll(maxCll.orNull)
      .maxFall(maxFall.orNull)
      .build()
}
