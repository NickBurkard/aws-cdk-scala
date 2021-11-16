package io.burkard.cdk.services.mediapackage

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPackagingConfigurationProps {

  def apply(
    id: String,
    packagingGroupId: String,
    mssPackage: Option[software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssPackageProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    cmafPackage: Option[software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafPackageProperty] = None,
    dashPackage: Option[software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashPackageProperty] = None,
    hlsPackage: Option[software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsPackageProperty] = None
  ): software.amazon.awscdk.services.mediapackage.CfnPackagingConfigurationProps =
    (new software.amazon.awscdk.services.mediapackage.CfnPackagingConfigurationProps.Builder)
      .id(id)
      .packagingGroupId(packagingGroupId)
      .mssPackage(mssPackage.orNull)
      .tags(tags.map(_.asJava).orNull)
      .cmafPackage(cmafPackage.orNull)
      .dashPackage(dashPackage.orNull)
      .hlsPackage(hlsPackage.orNull)
      .build()
}
