package io.burkard.cdk.services.appstream

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFleetProps {

  def apply(
    instanceType: String,
    name: String,
    displayName: Option[String] = None,
    domainJoinInfo: Option[software.amazon.awscdk.services.appstream.CfnFleet.DomainJoinInfoProperty] = None,
    iamRoleArn: Option[String] = None,
    idleDisconnectTimeoutInSeconds: Option[Number] = None,
    enableDefaultInternetAccess: Option[Boolean] = None,
    maxConcurrentSessions: Option[Number] = None,
    fleetType: Option[String] = None,
    maxUserDurationInSeconds: Option[Number] = None,
    platform: Option[String] = None,
    computeCapacity: Option[software.amazon.awscdk.services.appstream.CfnFleet.ComputeCapacityProperty] = None,
    usbDeviceFilterStrings: Option[List[String]] = None,
    imageArn: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    vpcConfig: Option[software.amazon.awscdk.services.appstream.CfnFleet.VpcConfigProperty] = None,
    imageName: Option[String] = None,
    disconnectTimeoutInSeconds: Option[Number] = None,
    streamView: Option[String] = None
  ): software.amazon.awscdk.services.appstream.CfnFleetProps =
    (new software.amazon.awscdk.services.appstream.CfnFleetProps.Builder)
      .instanceType(instanceType)
      .name(name)
      .displayName(displayName.orNull)
      .domainJoinInfo(domainJoinInfo.orNull)
      .iamRoleArn(iamRoleArn.orNull)
      .idleDisconnectTimeoutInSeconds(idleDisconnectTimeoutInSeconds.orNull)
      .enableDefaultInternetAccess(enableDefaultInternetAccess.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .maxConcurrentSessions(maxConcurrentSessions.orNull)
      .fleetType(fleetType.orNull)
      .maxUserDurationInSeconds(maxUserDurationInSeconds.orNull)
      .platform(platform.orNull)
      .computeCapacity(computeCapacity.orNull)
      .usbDeviceFilterStrings(usbDeviceFilterStrings.map(_.asJava).orNull)
      .imageArn(imageArn.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .vpcConfig(vpcConfig.orNull)
      .imageName(imageName.orNull)
      .disconnectTimeoutInSeconds(disconnectTimeoutInSeconds.orNull)
      .streamView(streamView.orNull)
      .build()
}
