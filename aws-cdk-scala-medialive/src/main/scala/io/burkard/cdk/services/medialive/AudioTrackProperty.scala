package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AudioTrackProperty {

  def apply(
    track: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackProperty.Builder)
      .track(track.orNull)
      .build()
}
