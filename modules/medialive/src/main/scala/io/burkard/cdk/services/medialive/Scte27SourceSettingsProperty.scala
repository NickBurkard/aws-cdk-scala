package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Scte27SourceSettingsProperty {

  def apply(
    pid: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.Scte27SourceSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.Scte27SourceSettingsProperty.Builder)
      .pid(pid.orNull)
      .build()
}
