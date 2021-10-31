package io.burkard.cdk.services.medialive

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EncoderSettingsProperty {

  def apply(
    captionDescriptions: Option[List[_]] = None,
    nielsenConfiguration: Option[software.amazon.awscdk.services.medialive.CfnChannel.NielsenConfigurationProperty] = None,
    availBlanking: Option[software.amazon.awscdk.services.medialive.CfnChannel.AvailBlankingProperty] = None,
    availConfiguration: Option[software.amazon.awscdk.services.medialive.CfnChannel.AvailConfigurationProperty] = None,
    globalConfiguration: Option[software.amazon.awscdk.services.medialive.CfnChannel.GlobalConfigurationProperty] = None,
    audioDescriptions: Option[List[_]] = None,
    timecodeConfig: Option[software.amazon.awscdk.services.medialive.CfnChannel.TimecodeConfigProperty] = None,
    motionGraphicsConfiguration: Option[software.amazon.awscdk.services.medialive.CfnChannel.MotionGraphicsConfigurationProperty] = None,
    featureActivations: Option[software.amazon.awscdk.services.medialive.CfnChannel.FeatureActivationsProperty] = None,
    blackoutSlate: Option[software.amazon.awscdk.services.medialive.CfnChannel.BlackoutSlateProperty] = None,
    videoDescriptions: Option[List[_]] = None,
    outputGroups: Option[List[_]] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.EncoderSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.EncoderSettingsProperty.Builder)
      .captionDescriptions(captionDescriptions.map(_.asJava).orNull)
      .nielsenConfiguration(nielsenConfiguration.orNull)
      .availBlanking(availBlanking.orNull)
      .availConfiguration(availConfiguration.orNull)
      .globalConfiguration(globalConfiguration.orNull)
      .audioDescriptions(audioDescriptions.map(_.asJava).orNull)
      .timecodeConfig(timecodeConfig.orNull)
      .motionGraphicsConfiguration(motionGraphicsConfiguration.orNull)
      .featureActivations(featureActivations.orNull)
      .blackoutSlate(blackoutSlate.orNull)
      .videoDescriptions(videoDescriptions.map(_.asJava).orNull)
      .outputGroups(outputGroups.map(_.asJava).orNull)
      .build()
}
