package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HlsWebdavSettingsProperty {

  def apply(
    connectionRetryInterval: Option[Number] = None,
    numRetries: Option[Number] = None,
    httpTransferMode: Option[String] = None,
    restartDelay: Option[Number] = None,
    filecacheDuration: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.HlsWebdavSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.HlsWebdavSettingsProperty.Builder)
      .connectionRetryInterval(connectionRetryInterval.orNull)
      .numRetries(numRetries.orNull)
      .httpTransferMode(httpTransferMode.orNull)
      .restartDelay(restartDelay.orNull)
      .filecacheDuration(filecacheDuration.orNull)
      .build()
}
