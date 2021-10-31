package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UdpGroupSettingsProperty {

  def apply(
    timedMetadataId3Period: Option[Number] = None,
    inputLossAction: Option[String] = None,
    timedMetadataId3Frame: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.UdpGroupSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.UdpGroupSettingsProperty.Builder)
      .timedMetadataId3Period(timedMetadataId3Period.orNull)
      .inputLossAction(inputLossAction.orNull)
      .timedMetadataId3Frame(timedMetadataId3Frame.orNull)
      .build()
}
