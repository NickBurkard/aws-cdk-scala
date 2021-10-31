package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HlsAkamaiSettingsProperty {

  def apply(
    connectionRetryInterval: Option[Number] = None,
    numRetries: Option[Number] = None,
    httpTransferMode: Option[String] = None,
    restartDelay: Option[Number] = None,
    token: Option[String] = None,
    salt: Option[String] = None,
    filecacheDuration: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.HlsAkamaiSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.HlsAkamaiSettingsProperty.Builder)
      .connectionRetryInterval(connectionRetryInterval.orNull)
      .numRetries(numRetries.orNull)
      .httpTransferMode(httpTransferMode.orNull)
      .restartDelay(restartDelay.orNull)
      .token(token.orNull)
      .salt(salt.orNull)
      .filecacheDuration(filecacheDuration.orNull)
      .build()
}
