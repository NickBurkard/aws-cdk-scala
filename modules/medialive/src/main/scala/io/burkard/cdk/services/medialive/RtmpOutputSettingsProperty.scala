package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RtmpOutputSettingsProperty {

  def apply(
    connectionRetryInterval: Option[Number] = None,
    numRetries: Option[Number] = None,
    certificateMode: Option[String] = None,
    destination: Option[software.amazon.awscdk.services.medialive.CfnChannel.OutputLocationRefProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.RtmpOutputSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.RtmpOutputSettingsProperty.Builder)
      .connectionRetryInterval(connectionRetryInterval.orNull)
      .numRetries(numRetries.orNull)
      .certificateMode(certificateMode.orNull)
      .destination(destination.orNull)
      .build()
}
