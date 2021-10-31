package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NetworkInterfaceProperty {

  def apply(
    interfaceType: Option[String] = None,
    associateCarrierIpAddress: Option[Boolean] = None,
    description: Option[String] = None,
    deviceIndex: Option[Number] = None,
    ipv6Addresses: Option[List[_]] = None,
    ipv6AddressCount: Option[Number] = None,
    deleteOnTermination: Option[Boolean] = None,
    secondaryPrivateIpAddressCount: Option[Number] = None,
    privateIpAddress: Option[String] = None,
    networkInterfaceId: Option[String] = None,
    subnetId: Option[String] = None,
    groups: Option[List[String]] = None,
    privateIpAddresses: Option[List[_]] = None,
    associatePublicIpAddress: Option[Boolean] = None,
    networkCardIndex: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceProperty =
    (new software.amazon.awscdk.services.ec2.CfnLaunchTemplate.NetworkInterfaceProperty.Builder)
      .interfaceType(interfaceType.orNull)
      .associateCarrierIpAddress(associateCarrierIpAddress.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .description(description.orNull)
      .deviceIndex(deviceIndex.orNull)
      .ipv6Addresses(ipv6Addresses.map(_.asJava).orNull)
      .ipv6AddressCount(ipv6AddressCount.orNull)
      .deleteOnTermination(deleteOnTermination.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount.orNull)
      .privateIpAddress(privateIpAddress.orNull)
      .networkInterfaceId(networkInterfaceId.orNull)
      .subnetId(subnetId.orNull)
      .groups(groups.map(_.asJava).orNull)
      .privateIpAddresses(privateIpAddresses.map(_.asJava).orNull)
      .associatePublicIpAddress(associatePublicIpAddress.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .networkCardIndex(networkCardIndex.orNull)
      .build()
}
