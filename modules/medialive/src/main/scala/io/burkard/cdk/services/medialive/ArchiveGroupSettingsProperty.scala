package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ArchiveGroupSettingsProperty {

  def apply(
    rolloverInterval: Option[Number] = None,
    archiveCdnSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.ArchiveCdnSettingsProperty] = None,
    destination: Option[software.amazon.awscdk.services.medialive.CfnChannel.OutputLocationRefProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.ArchiveGroupSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.ArchiveGroupSettingsProperty.Builder)
      .rolloverInterval(rolloverInterval.orNull)
      .archiveCdnSettings(archiveCdnSettings.orNull)
      .destination(destination.orNull)
      .build()
}
