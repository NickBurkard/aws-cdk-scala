package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AncillarySourceSettingsProperty {

  def apply(
    sourceAncillaryChannelNumber: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.AncillarySourceSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.AncillarySourceSettingsProperty.Builder)
      .sourceAncillaryChannelNumber(sourceAncillaryChannelNumber.orNull)
      .build()
}
