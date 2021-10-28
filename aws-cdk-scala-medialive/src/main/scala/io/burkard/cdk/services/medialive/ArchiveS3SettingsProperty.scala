package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ArchiveS3SettingsProperty {

  def apply(
    cannedAcl: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.ArchiveS3SettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.ArchiveS3SettingsProperty.Builder)
      .cannedAcl(cannedAcl.orNull)
      .build()
}
