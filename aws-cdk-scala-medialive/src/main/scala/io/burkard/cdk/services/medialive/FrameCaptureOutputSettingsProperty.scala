package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FrameCaptureOutputSettingsProperty {

  def apply(
    nameModifier: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureOutputSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureOutputSettingsProperty.Builder)
      .nameModifier(nameModifier.orNull)
      .build()
}
