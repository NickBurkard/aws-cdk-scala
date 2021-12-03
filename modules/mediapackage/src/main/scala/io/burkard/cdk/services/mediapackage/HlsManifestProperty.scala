package io.burkard.cdk.services.mediapackage

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HlsManifestProperty {

  def apply(
    id: String,
    includeIframeOnlyStream: Option[Boolean] = None,
    playlistType: Option[String] = None,
    adTriggers: Option[List[String]] = None,
    url: Option[String] = None,
    manifestName: Option[String] = None,
    adsOnDeliveryRestrictions: Option[String] = None,
    adMarkers: Option[String] = None,
    programDateTimeIntervalSeconds: Option[Number] = None,
    playlistWindowSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsManifestProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsManifestProperty.Builder)
      .id(id)
      .includeIframeOnlyStream(includeIframeOnlyStream.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .playlistType(playlistType.orNull)
      .adTriggers(adTriggers.map(_.asJava).orNull)
      .url(url.orNull)
      .manifestName(manifestName.orNull)
      .adsOnDeliveryRestrictions(adsOnDeliveryRestrictions.orNull)
      .adMarkers(adMarkers.orNull)
      .programDateTimeIntervalSeconds(programDateTimeIntervalSeconds.orNull)
      .playlistWindowSeconds(playlistWindowSeconds.orNull)
      .build()
}
