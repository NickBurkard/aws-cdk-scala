package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FrameCaptureS3SettingsProperty {

  def apply(
    cannedAcl: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureS3SettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureS3SettingsProperty.Builder)
      .cannedAcl(cannedAcl.orNull)
      .build()
}
