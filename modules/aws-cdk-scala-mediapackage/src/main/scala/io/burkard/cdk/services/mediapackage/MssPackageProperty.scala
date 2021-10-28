package io.burkard.cdk.services.mediapackage

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MssPackageProperty {

  def apply(
    mssManifests: Option[List[_]] = None,
    encryption: Option[software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssEncryptionProperty] = None,
    segmentDurationSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssPackageProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssPackageProperty.Builder)
      .mssManifests(mssManifests.map(_.asJava).orNull)
      .encryption(encryption.orNull)
      .segmentDurationSeconds(segmentDurationSeconds.orNull)
      .build()
}
