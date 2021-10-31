package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HlsMediaStoreSettingsProperty {

  def apply(
    mediaStoreStorageClass: Option[String] = None,
    connectionRetryInterval: Option[Number] = None,
    numRetries: Option[Number] = None,
    restartDelay: Option[Number] = None,
    filecacheDuration: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.HlsMediaStoreSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.HlsMediaStoreSettingsProperty.Builder)
      .mediaStoreStorageClass(mediaStoreStorageClass.orNull)
      .connectionRetryInterval(connectionRetryInterval.orNull)
      .numRetries(numRetries.orNull)
      .restartDelay(restartDelay.orNull)
      .filecacheDuration(filecacheDuration.orNull)
      .build()
}
