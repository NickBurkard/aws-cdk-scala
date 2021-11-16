package io.burkard.cdk.services.appstream

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFleet {

  def apply(
    internalResourceId: String,
    instanceType: String,
    computeCapacity: software.amazon.awscdk.services.appstream.CfnFleet.ComputeCapacityProperty,
    name: String,
    displayName: Option[String] = None,
    domainJoinInfo: Option[software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty] = None,
    iamRoleArn: Option[String] = None,
    idleDisconnectTimeoutInSeconds: Option[Number] = None,
    enableDefaultInternetAccess: Option[Boolean] = None,
    fleetType: Option[String] = None,
    maxUserDurationInSeconds: Option[Number] = None,
    imageArn: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    vpcConfig: Option[software.amazon.awscdk.services.appstream.CfnFleet.VpcConfigProperty] = None,
    imageName: Option[String] = None,
    disconnectTimeoutInSeconds: Option[Number] = None,
    streamView: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appstream.CfnFleet =
    software.amazon.awscdk.services.appstream.CfnFleet.Builder
      .create(stackCtx, internalResourceId)
      .instanceType(instanceType)
      .computeCapacity(computeCapacity)
      .name(name)
      .displayName(displayName.orNull)
      .domainJoinInfo(domainJoinInfo.orNull)
      .iamRoleArn(iamRoleArn.orNull)
      .idleDisconnectTimeoutInSeconds(idleDisconnectTimeoutInSeconds.orNull)
      .enableDefaultInternetAccess(enableDefaultInternetAccess.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .fleetType(fleetType.orNull)
      .maxUserDurationInSeconds(maxUserDurationInSeconds.orNull)
      .imageArn(imageArn.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .vpcConfig(vpcConfig.orNull)
      .imageName(imageName.orNull)
      .disconnectTimeoutInSeconds(disconnectTimeoutInSeconds.orNull)
      .streamView(streamView.orNull)
      .build()
}
