package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HlsBasicPutSettingsProperty {

  def apply(
    connectionRetryInterval: Option[Number] = None,
    numRetries: Option[Number] = None,
    restartDelay: Option[Number] = None,
    filecacheDuration: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.HlsBasicPutSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.HlsBasicPutSettingsProperty.Builder)
      .connectionRetryInterval(connectionRetryInterval.orNull)
      .numRetries(numRetries.orNull)
      .restartDelay(restartDelay.orNull)
      .filecacheDuration(filecacheDuration.orNull)
      .build()
}
