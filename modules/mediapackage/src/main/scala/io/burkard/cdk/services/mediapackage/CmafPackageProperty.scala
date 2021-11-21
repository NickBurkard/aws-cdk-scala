package io.burkard.cdk.services.mediapackage

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CmafPackageProperty {

  def apply(
    hlsManifests: List[_],
    encryption: Option[software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafEncryptionProperty] = None,
    includeEncoderConfigurationInSegments: Option[Boolean] = None,
    segmentDurationSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafPackageProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafPackageProperty.Builder)
      .hlsManifests(hlsManifests.asJava)
      .encryption(encryption.orNull)
      .includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .segmentDurationSeconds(segmentDurationSeconds.orNull)
      .build()
}
