package io.burkard.cdk.services.medialive

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AudioChannelMappingProperty {

  def apply(
    outputChannel: Option[Number] = None,
    inputChannelLevels: Option[List[_]] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.AudioChannelMappingProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.AudioChannelMappingProperty.Builder)
      .outputChannel(outputChannel.orNull)
      .inputChannelLevels(inputChannelLevels.map(_.asJava).orNull)
      .build()
}
