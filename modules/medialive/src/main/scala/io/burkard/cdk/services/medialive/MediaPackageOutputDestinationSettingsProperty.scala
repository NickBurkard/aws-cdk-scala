package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MediaPackageOutputDestinationSettingsProperty {

  def apply(
    channelId: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageOutputDestinationSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageOutputDestinationSettingsProperty.Builder)
      .channelId(channelId.orNull)
      .build()
}
