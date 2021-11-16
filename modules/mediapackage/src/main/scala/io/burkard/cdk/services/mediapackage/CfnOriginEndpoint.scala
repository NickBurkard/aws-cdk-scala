package io.burkard.cdk.services.mediapackage

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnOriginEndpoint {

  def apply(
    internalResourceId: String,
    id: String,
    channelId: String,
    mssPackage: Option[software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.MssPackageProperty] = None,
    cmafPackage: Option[software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.CmafPackageProperty] = None,
    dashPackage: Option[software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.DashPackageProperty] = None,
    authorization: Option[software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.AuthorizationProperty] = None,
    timeDelaySeconds: Option[Number] = None,
    manifestName: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    startoverWindowSeconds: Option[Number] = None,
    origination: Option[String] = None,
    whitelist: Option[List[String]] = None,
    hlsPackage: Option[software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.HlsPackageProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint =
    software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint.Builder
      .create(stackCtx, internalResourceId)
      .id(id)
      .channelId(channelId)
      .mssPackage(mssPackage.orNull)
      .cmafPackage(cmafPackage.orNull)
      .dashPackage(dashPackage.orNull)
      .authorization(authorization.orNull)
      .timeDelaySeconds(timeDelaySeconds.orNull)
      .manifestName(manifestName.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .startoverWindowSeconds(startoverWindowSeconds.orNull)
      .origination(origination.orNull)
      .whitelist(whitelist.map(_.asJava).orNull)
      .hlsPackage(hlsPackage.orNull)
      .build()
}
