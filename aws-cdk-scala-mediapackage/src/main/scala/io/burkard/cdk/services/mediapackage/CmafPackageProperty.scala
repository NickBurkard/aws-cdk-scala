package io.burkard.cdk.services.mediapackage

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CmafPackageProperty {

  def apply(
    hlsManifests: Option[List[_]] = None,
    encryption: Option[software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafEncryptionProperty] = None,
    includeEncoderConfigurationInSegments: Option[Boolean] = None,
    segmentDurationSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafPackageProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafPackageProperty.Builder)
      .hlsManifests(hlsManifests.map(_.asJava).orNull)
      .encryption(encryption.orNull)
      .includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .segmentDurationSeconds(segmentDurationSeconds.orNull)
      .build()
}
