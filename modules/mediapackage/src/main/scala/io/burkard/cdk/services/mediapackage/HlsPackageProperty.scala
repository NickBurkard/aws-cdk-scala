package io.burkard.cdk.services.mediapackage

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HlsPackageProperty {

  def apply(
    includeIframeOnlyStream: Option[Boolean] = None,
    useAudioRenditionGroup: Option[Boolean] = None,
    playlistType: Option[String] = None,
    adTriggers: Option[List[String]] = None,
    streamSelection: Option[software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.StreamSelectionProperty] = None,
    encryption: Option[software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsEncryptionProperty] = None,
    segmentDurationSeconds: Option[Number] = None,
    adsOnDeliveryRestrictions: Option[String] = None,
    adMarkers: Option[String] = None,
    programDateTimeIntervalSeconds: Option[Number] = None,
    playlistWindowSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsPackageProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsPackageProperty.Builder)
      .includeIframeOnlyStream(includeIframeOnlyStream.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .useAudioRenditionGroup(useAudioRenditionGroup.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .playlistType(playlistType.orNull)
      .adTriggers(adTriggers.map(_.asJava).orNull)
      .streamSelection(streamSelection.orNull)
      .encryption(encryption.orNull)
      .segmentDurationSeconds(segmentDurationSeconds.orNull)
      .adsOnDeliveryRestrictions(adsOnDeliveryRestrictions.orNull)
      .adMarkers(adMarkers.orNull)
      .programDateTimeIntervalSeconds(programDateTimeIntervalSeconds.orNull)
      .playlistWindowSeconds(playlistWindowSeconds.orNull)
      .build()
}
