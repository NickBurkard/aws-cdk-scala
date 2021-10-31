package io.burkard.cdk.services.appstream

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnImageBuilderProps {

  def apply(
    displayName: Option[String] = None,
    accessEndpoints: Option[List[_]] = None,
    domainJoinInfo: Option[software.amazon.awscdk.services.appstream.CfnImageBuilder.DomainJoinInfoProperty] = None,
    iamRoleArn: Option[String] = None,
    enableDefaultInternetAccess: Option[Boolean] = None,
    instanceType: Option[String] = None,
    name: Option[String] = None,
    imageArn: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    vpcConfig: Option[software.amazon.awscdk.services.appstream.CfnImageBuilder.VpcConfigProperty] = None,
    imageName: Option[String] = None,
    appstreamAgentVersion: Option[String] = None
  ): software.amazon.awscdk.services.appstream.CfnImageBuilderProps =
    (new software.amazon.awscdk.services.appstream.CfnImageBuilderProps.Builder)
      .displayName(displayName.orNull)
      .accessEndpoints(accessEndpoints.map(_.asJava).orNull)
      .domainJoinInfo(domainJoinInfo.orNull)
      .iamRoleArn(iamRoleArn.orNull)
      .enableDefaultInternetAccess(enableDefaultInternetAccess.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .instanceType(instanceType.orNull)
      .name(name.orNull)
      .imageArn(imageArn.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .vpcConfig(vpcConfig.orNull)
      .imageName(imageName.orNull)
      .appstreamAgentVersion(appstreamAgentVersion.orNull)
      .build()
}
