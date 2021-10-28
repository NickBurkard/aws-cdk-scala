package io.burkard.cdk.services.medialive

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AudioTrackSelectionProperty {

  def apply(
    tracks: Option[List[_]] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackSelectionProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackSelectionProperty.Builder)
      .tracks(tracks.map(_.asJava).orNull)
      .build()
}
