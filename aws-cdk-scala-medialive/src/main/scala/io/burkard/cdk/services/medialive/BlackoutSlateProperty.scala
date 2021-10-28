package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BlackoutSlateProperty {

  def apply(
    networkEndBlackoutImage: Option[software.amazon.awscdk.services.medialive.CfnChannel.InputLocationProperty] = None,
    networkId: Option[String] = None,
    state: Option[String] = None,
    blackoutSlateImage: Option[software.amazon.awscdk.services.medialive.CfnChannel.InputLocationProperty] = None,
    networkEndBlackout: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.BlackoutSlateProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.BlackoutSlateProperty.Builder)
      .networkEndBlackoutImage(networkEndBlackoutImage.orNull)
      .networkId(networkId.orNull)
      .state(state.orNull)
      .blackoutSlateImage(blackoutSlateImage.orNull)
      .networkEndBlackout(networkEndBlackout.orNull)
      .build()
}
