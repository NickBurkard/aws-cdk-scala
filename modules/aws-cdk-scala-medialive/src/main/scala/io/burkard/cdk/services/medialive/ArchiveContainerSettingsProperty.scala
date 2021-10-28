package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ArchiveContainerSettingsProperty {

  def apply(
    rawSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.RawSettingsProperty] = None,
    m2TsSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.M2tsSettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.ArchiveContainerSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.ArchiveContainerSettingsProperty.Builder)
      .rawSettings(rawSettings.orNull)
      .m2TsSettings(m2TsSettings.orNull)
      .build()
}
