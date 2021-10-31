package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HlsCdnSettingsProperty {

  def apply(
    hlsS3Settings: Option[software.amazon.awscdk.services.medialive.CfnChannel.HlsS3SettingsProperty] = None,
    hlsBasicPutSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.HlsBasicPutSettingsProperty] = None,
    hlsMediaStoreSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.HlsMediaStoreSettingsProperty] = None,
    hlsWebdavSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.HlsWebdavSettingsProperty] = None,
    hlsAkamaiSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.HlsAkamaiSettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.HlsCdnSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.HlsCdnSettingsProperty.Builder)
      .hlsS3Settings(hlsS3Settings.orNull)
      .hlsBasicPutSettings(hlsBasicPutSettings.orNull)
      .hlsMediaStoreSettings(hlsMediaStoreSettings.orNull)
      .hlsWebdavSettings(hlsWebdavSettings.orNull)
      .hlsAkamaiSettings(hlsAkamaiSettings.orNull)
      .build()
}
