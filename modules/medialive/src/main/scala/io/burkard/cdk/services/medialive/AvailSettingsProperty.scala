package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AvailSettingsProperty {

  def apply(
    scte35SpliceInsert: Option[software.amazon.awscdk.services.medialive.CfnChannel.Scte35SpliceInsertProperty] = None,
    scte35TimeSignalApos: Option[software.amazon.awscdk.services.medialive.CfnChannel.Scte35TimeSignalAposProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.AvailSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.AvailSettingsProperty.Builder)
      .scte35SpliceInsert(scte35SpliceInsert.orNull)
      .scte35TimeSignalApos(scte35TimeSignalApos.orNull)
      .build()
}
