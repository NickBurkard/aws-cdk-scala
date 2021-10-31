package io.burkard.cdk.services.mediapackage

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HlsManifestProperty {

  def apply(
    includeIframeOnlyStream: Option[Boolean] = None,
    playlistType: Option[String] = None,
    adTriggers: Option[List[String]] = None,
    url: Option[String] = None,
    id: Option[String] = None,
    manifestName: Option[String] = None,
    adsOnDeliveryRestrictions: Option[String] = None,
    adMarkers: Option[String] = None,
    programDateTimeIntervalSeconds: Option[Number] = None,
    playlistWindowSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsManifestProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsManifestProperty.Builder)
      .includeIframeOnlyStream(includeIframeOnlyStream.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .playlistType(playlistType.orNull)
      .adTriggers(adTriggers.map(_.asJava).orNull)
      .url(url.orNull)
      .id(id.orNull)
      .manifestName(manifestName.orNull)
      .adsOnDeliveryRestrictions(adsOnDeliveryRestrictions.orNull)
      .adMarkers(adMarkers.orNull)
      .programDateTimeIntervalSeconds(programDateTimeIntervalSeconds.orNull)
      .playlistWindowSeconds(playlistWindowSeconds.orNull)
      .build()
}
