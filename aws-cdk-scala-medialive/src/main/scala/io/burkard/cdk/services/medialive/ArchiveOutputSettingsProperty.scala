package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ArchiveOutputSettingsProperty {

  def apply(
    containerSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.ArchiveContainerSettingsProperty] = None,
    nameModifier: Option[String] = None,
    extension: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.ArchiveOutputSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.ArchiveOutputSettingsProperty.Builder)
      .containerSettings(containerSettings.orNull)
      .nameModifier(nameModifier.orNull)
      .extension(extension.orNull)
      .build()
}
