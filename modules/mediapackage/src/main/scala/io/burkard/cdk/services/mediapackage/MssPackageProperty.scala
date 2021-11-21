package io.burkard.cdk.services.mediapackage

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MssPackageProperty {

  def apply(
    mssManifests: List[_],
    encryption: Option[software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssEncryptionProperty] = None,
    segmentDurationSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssPackageProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssPackageProperty.Builder)
      .mssManifests(mssManifests.asJava)
      .encryption(encryption.orNull)
      .segmentDurationSeconds(segmentDurationSeconds.orNull)
      .build()
}
