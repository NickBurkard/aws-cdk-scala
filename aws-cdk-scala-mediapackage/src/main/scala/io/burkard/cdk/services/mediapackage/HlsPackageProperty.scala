package io.burkard.cdk.services.mediapackage

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HlsPackageProperty {

  def apply(
    useAudioRenditionGroup: Option[Boolean] = None,
    hlsManifests: Option[List[_]] = None,
    encryption: Option[software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsEncryptionProperty] = None,
    segmentDurationSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsPackageProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsPackageProperty.Builder)
      .useAudioRenditionGroup(useAudioRenditionGroup.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .hlsManifests(hlsManifests.map(_.asJava).orNull)
      .encryption(encryption.orNull)
      .segmentDurationSeconds(segmentDurationSeconds.orNull)
      .build()
}
