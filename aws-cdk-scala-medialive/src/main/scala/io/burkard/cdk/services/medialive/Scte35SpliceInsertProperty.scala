package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Scte35SpliceInsertProperty {

  def apply(
    adAvailOffset: Option[Number] = None,
    webDeliveryAllowedFlag: Option[String] = None,
    noRegionalBlackoutFlag: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.Scte35SpliceInsertProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.Scte35SpliceInsertProperty.Builder)
      .adAvailOffset(adAvailOffset.orNull)
      .webDeliveryAllowedFlag(webDeliveryAllowedFlag.orNull)
      .noRegionalBlackoutFlag(noRegionalBlackoutFlag.orNull)
      .build()
}
