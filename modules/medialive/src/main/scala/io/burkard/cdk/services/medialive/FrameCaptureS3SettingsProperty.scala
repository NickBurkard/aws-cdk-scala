package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FrameCaptureS3SettingsProperty {

  def apply(
    cannedAcl: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureS3SettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureS3SettingsProperty.Builder)
      .cannedAcl(cannedAcl.orNull)
      .build()
}
