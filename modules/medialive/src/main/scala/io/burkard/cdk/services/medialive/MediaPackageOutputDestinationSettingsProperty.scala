package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MediaPackageOutputDestinationSettingsProperty {

  def apply(
    channelId: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageOutputDestinationSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.MediaPackageOutputDestinationSettingsProperty.Builder)
      .channelId(channelId.orNull)
      .build()
}
