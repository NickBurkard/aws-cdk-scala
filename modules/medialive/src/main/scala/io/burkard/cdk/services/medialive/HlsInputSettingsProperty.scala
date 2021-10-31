package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HlsInputSettingsProperty {

  def apply(
    retries: Option[Number] = None,
    bufferSegments: Option[Number] = None,
    bandwidth: Option[Number] = None,
    retryInterval: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.HlsInputSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.HlsInputSettingsProperty.Builder)
      .retries(retries.orNull)
      .bufferSegments(bufferSegments.orNull)
      .bandwidth(bandwidth.orNull)
      .retryInterval(retryInterval.orNull)
      .build()
}
