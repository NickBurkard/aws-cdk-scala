package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FrameCaptureOutputSettingsProperty {

  def apply(
    nameModifier: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureOutputSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureOutputSettingsProperty.Builder)
      .nameModifier(nameModifier.orNull)
      .build()
}
