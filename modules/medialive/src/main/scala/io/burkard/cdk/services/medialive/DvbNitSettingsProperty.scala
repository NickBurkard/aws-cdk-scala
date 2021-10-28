package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DvbNitSettingsProperty {

  def apply(
    networkId: Option[Number] = None,
    networkName: Option[String] = None,
    repInterval: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.DvbNitSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.DvbNitSettingsProperty.Builder)
      .networkId(networkId.orNull)
      .networkName(networkName.orNull)
      .repInterval(repInterval.orNull)
      .build()
}
