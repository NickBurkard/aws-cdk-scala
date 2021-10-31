package io.burkard.cdk.services.mediapackage

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPackagingConfigurationProps {

  def apply(
    mssPackage: Option[software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssPackageProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    cmafPackage: Option[software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafPackageProperty] = None,
    dashPackage: Option[software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashPackageProperty] = None,
    id: Option[String] = None,
    hlsPackage: Option[software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsPackageProperty] = None,
    packagingGroupId: Option[String] = None
  ): software.amazon.awscdk.services.mediapackage.CfnPackagingConfigurationProps =
    (new software.amazon.awscdk.services.mediapackage.CfnPackagingConfigurationProps.Builder)
      .mssPackage(mssPackage.orNull)
      .tags(tags.map(_.asJava).orNull)
      .cmafPackage(cmafPackage.orNull)
      .dashPackage(dashPackage.orNull)
      .id(id.orNull)
      .hlsPackage(hlsPackage.orNull)
      .packagingGroupId(packagingGroupId.orNull)
      .build()
}
