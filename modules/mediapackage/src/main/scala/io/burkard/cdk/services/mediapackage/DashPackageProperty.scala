package io.burkard.cdk.services.mediapackage

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DashPackageProperty {

  def apply(
    minUpdatePeriodSeconds: Option[Number] = None,
    utcTimingUri: Option[String] = None,
    streamSelection: Option[software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.StreamSelectionProperty] = None,
    adsOnDeliveryRestrictions: Option[String] = None,
    encryption: Option[software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashEncryptionProperty] = None,
    profile: Option[String] = None,
    manifestLayout: Option[String] = None,
    periodTriggers: Option[List[String]] = None,
    suggestedPresentationDelaySeconds: Option[Number] = None,
    adTriggers: Option[List[String]] = None,
    segmentTemplateFormat: Option[String] = None,
    minBufferTimeSeconds: Option[Number] = None,
    utcTiming: Option[String] = None,
    manifestWindowSeconds: Option[Number] = None,
    segmentDurationSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashPackageProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashPackageProperty.Builder)
      .minUpdatePeriodSeconds(minUpdatePeriodSeconds.orNull)
      .utcTimingUri(utcTimingUri.orNull)
      .streamSelection(streamSelection.orNull)
      .adsOnDeliveryRestrictions(adsOnDeliveryRestrictions.orNull)
      .encryption(encryption.orNull)
      .profile(profile.orNull)
      .manifestLayout(manifestLayout.orNull)
      .periodTriggers(periodTriggers.map(_.asJava).orNull)
      .suggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds.orNull)
      .adTriggers(adTriggers.map(_.asJava).orNull)
      .segmentTemplateFormat(segmentTemplateFormat.orNull)
      .minBufferTimeSeconds(minBufferTimeSeconds.orNull)
      .utcTiming(utcTiming.orNull)
      .manifestWindowSeconds(manifestWindowSeconds.orNull)
      .segmentDurationSeconds(segmentDurationSeconds.orNull)
      .build()
}
