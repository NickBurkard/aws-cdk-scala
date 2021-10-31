package io.burkard.cdk.services.medialive

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OutputProperty {

  def apply(
    videoDescriptionName: Option[String] = None,
    captionDescriptionNames: Option[List[String]] = None,
    outputName: Option[String] = None,
    audioDescriptionNames: Option[List[String]] = None,
    outputSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.OutputSettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.OutputProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.OutputProperty.Builder)
      .videoDescriptionName(videoDescriptionName.orNull)
      .captionDescriptionNames(captionDescriptionNames.map(_.asJava).orNull)
      .outputName(outputName.orNull)
      .audioDescriptionNames(audioDescriptionNames.map(_.asJava).orNull)
      .outputSettings(outputSettings.orNull)
      .build()
}
