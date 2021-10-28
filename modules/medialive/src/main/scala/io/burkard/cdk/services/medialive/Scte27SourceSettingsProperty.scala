package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Scte27SourceSettingsProperty {

  def apply(
    pid: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.Scte27SourceSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.Scte27SourceSettingsProperty.Builder)
      .pid(pid.orNull)
      .build()
}
