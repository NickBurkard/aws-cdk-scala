package io.burkard.cdk.services.mediapackage

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnOriginEndpointProps {

  def apply(
    mssPackage: Option[software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssPackageProperty] = None,
    cmafPackage: Option[software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafPackageProperty] = None,
    dashPackage: Option[software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashPackageProperty] = None,
    authorization: Option[software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.AuthorizationProperty] = None,
    id: Option[String] = None,
    timeDelaySeconds: Option[Number] = None,
    manifestName: Option[String] = None,
    channelId: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    startoverWindowSeconds: Option[Number] = None,
    origination: Option[String] = None,
    whitelist: Option[List[String]] = None,
    hlsPackage: Option[software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsPackageProperty] = None
  ): software.amazon.awscdk.services.mediapackage.CfnOriginEndpointProps =
    (new software.amazon.awscdk.services.mediapackage.CfnOriginEndpointProps.Builder)
      .mssPackage(mssPackage.orNull)
      .cmafPackage(cmafPackage.orNull)
      .dashPackage(dashPackage.orNull)
      .authorization(authorization.orNull)
      .id(id.orNull)
      .timeDelaySeconds(timeDelaySeconds.orNull)
      .manifestName(manifestName.orNull)
      .channelId(channelId.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .startoverWindowSeconds(startoverWindowSeconds.orNull)
      .origination(origination.orNull)
      .whitelist(whitelist.map(_.asJava).orNull)
      .hlsPackage(hlsPackage.orNull)
      .build()
}
