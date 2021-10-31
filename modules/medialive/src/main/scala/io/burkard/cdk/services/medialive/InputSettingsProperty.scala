package io.burkard.cdk.services.medialive

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InputSettingsProperty {

  def apply(
    sourceEndBehavior: Option[String] = None,
    videoSelector: Option[software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorProperty] = None,
    smpte2038DataPreference: Option[String] = None,
    deblockFilter: Option[String] = None,
    denoiseFilter: Option[String] = None,
    captionSelectors: Option[List[_]] = None,
    audioSelectors: Option[List[_]] = None,
    networkInputSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.NetworkInputSettingsProperty] = None,
    filterStrength: Option[Number] = None,
    inputFilter: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.InputSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.InputSettingsProperty.Builder)
      .sourceEndBehavior(sourceEndBehavior.orNull)
      .videoSelector(videoSelector.orNull)
      .smpte2038DataPreference(smpte2038DataPreference.orNull)
      .deblockFilter(deblockFilter.orNull)
      .denoiseFilter(denoiseFilter.orNull)
      .captionSelectors(captionSelectors.map(_.asJava).orNull)
      .audioSelectors(audioSelectors.map(_.asJava).orNull)
      .networkInputSettings(networkInputSettings.orNull)
      .filterStrength(filterStrength.orNull)
      .inputFilter(inputFilter.orNull)
      .build()
}
