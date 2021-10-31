package io.burkard.cdk.services.medialive

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
