package io.burkard.cdk.services.mediapackage

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CmafPackageProperty {

  def apply(
    streamSelection: Option[software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.StreamSelectionProperty] = None,
    hlsManifests: Option[List[_]] = None,
    encryption: Option[software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafEncryptionProperty] = None,
    segmentDurationSeconds: Option[Number] = None,
    segmentPrefix: Option[String] = None
  ): software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafPackageProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafPackageProperty.Builder)
      .streamSelection(streamSelection.orNull)
      .hlsManifests(hlsManifests.map(_.asJava).orNull)
      .encryption(encryption.orNull)
      .segmentDurationSeconds(segmentDurationSeconds.orNull)
      .segmentPrefix(segmentPrefix.orNull)
      .build()
}
