package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HlsS3SettingsProperty {

  def apply(
    cannedAcl: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.HlsS3SettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.HlsS3SettingsProperty.Builder)
      .cannedAcl(cannedAcl.orNull)
      .build()
}
