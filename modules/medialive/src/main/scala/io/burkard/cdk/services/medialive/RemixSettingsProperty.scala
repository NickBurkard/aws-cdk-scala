package io.burkard.cdk.services.medialive

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RemixSettingsProperty {

  def apply(
    channelsOut: Option[Number] = None,
    channelsIn: Option[Number] = None,
    channelMappings: Option[List[_]] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.RemixSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.RemixSettingsProperty.Builder)
      .channelsOut(channelsOut.orNull)
      .channelsIn(channelsIn.orNull)
      .channelMappings(channelMappings.map(_.asJava).orNull)
      .build()
}