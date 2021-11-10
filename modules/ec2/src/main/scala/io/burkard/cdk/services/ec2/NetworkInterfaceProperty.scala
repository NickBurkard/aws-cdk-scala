package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NetworkInterfaceProperty {

  def apply(
    description: Option[String] = None,
    deviceIndex: Option[String] = None,
    associatePublicIpAddress: Option[Boolean] = None,
    ipv6Addresses: Option[List[_]] = None,
    ipv6AddressCount: Option[Number] = None,
    deleteOnTermination: Option[Boolean] = None,
    groupSet: Option[List[String]] = None,
    secondaryPrivateIpAddressCount: Option[Number] = None,
    privateIpAddress: Option[String] = None,
    networkInterfaceId: Option[String] = None,
    subnetId: Option[String] = None,
    privateIpAddresses: Option[List[_]] = None
  ): software.amazon.awscdk.services.ec2.CfnInstance.NetworkInterfaceProperty =
    (new software.amazon.awscdk.services.ec2.CfnInstance.NetworkInterfaceProperty.Builder)
      .description(description.orNull)
      .deviceIndex(deviceIndex.orNull)
      .associatePublicIpAddress(associatePublicIpAddress.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ipv6Addresses(ipv6Addresses.map(_.asJava).orNull)
      .ipv6AddressCount(ipv6AddressCount.orNull)
      .deleteOnTermination(deleteOnTermination.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .groupSet(groupSet.map(_.asJava).orNull)
      .secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount.orNull)
      .privateIpAddress(privateIpAddress.orNull)
      .networkInterfaceId(networkInterfaceId.orNull)
      .subnetId(subnetId.orNull)
      .privateIpAddresses(privateIpAddresses.map(_.asJava).orNull)
      .build()
}
