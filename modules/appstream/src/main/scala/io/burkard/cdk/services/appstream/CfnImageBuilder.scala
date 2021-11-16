package io.burkard.cdk.services.appstream

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnImageBuilder {

  def apply(
    internalResourceId: String,
    instanceType: String,
    name: String,
    displayName: Option[String] = None,
    accessEndpoints: Option[List[_]] = None,
    domainJoinInfo: Option[software.amazon.awscdk.services.appstream.CfnImageBuilder.DomainJoinInfoProperty] = None,
    iamRoleArn: Option[String] = None,
    enableDefaultInternetAccess: Option[Boolean] = None,
    imageArn: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    vpcConfig: Option[software.amazon.awscdk.services.appstream.CfnImageBuilder.VpcConfigProperty] = None,
    imageName: Option[String] = None,
    appstreamAgentVersion: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appstream.CfnImageBuilder =
    software.amazon.awscdk.services.appstream.CfnImageBuilder.Builder
      .create(stackCtx, internalResourceId)
      .instanceType(instanceType)
      .name(name)
      .displayName(displayName.orNull)
      .accessEndpoints(accessEndpoints.map(_.asJava).orNull)
      .domainJoinInfo(domainJoinInfo.orNull)
      .iamRoleArn(iamRoleArn.orNull)
      .enableDefaultInternetAccess(enableDefaultInternetAccess.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .imageArn(imageArn.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .vpcConfig(vpcConfig.orNull)
      .imageName(imageName.orNull)
      .appstreamAgentVersion(appstreamAgentVersion.orNull)
      .build()
}
