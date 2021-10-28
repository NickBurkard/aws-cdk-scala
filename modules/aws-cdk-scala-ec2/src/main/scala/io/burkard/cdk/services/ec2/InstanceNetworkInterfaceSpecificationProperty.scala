package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InstanceNetworkInterfaceSpecificationProperty {

  def apply(
    description: Option[String] = None,
    deviceIndex: Option[Number] = None,
    associatePublicIpAddress: Option[Boolean] = None,
    ipv6Addresses: Option[List[_]] = None,
    ipv6AddressCount: Option[Number] = None,
    deleteOnTermination: Option[Boolean] = None,
    secondaryPrivateIpAddressCount: Option[Number] = None,
    networkInterfaceId: Option[String] = None,
    subnetId: Option[String] = None,
    groups: Option[List[String]] = None,
    privateIpAddresses: Option[List[_]] = None
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceNetworkInterfaceSpecificationProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceNetworkInterfaceSpecificationProperty.Builder)
      .description(description.orNull)
      .deviceIndex(deviceIndex.orNull)
      .associatePublicIpAddress(associatePublicIpAddress.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ipv6Addresses(ipv6Addresses.map(_.asJava).orNull)
      .ipv6AddressCount(ipv6AddressCount.orNull)
      .deleteOnTermination(deleteOnTermination.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount.orNull)
      .networkInterfaceId(networkInterfaceId.orNull)
      .subnetId(subnetId.orNull)
      .groups(groups.map(_.asJava).orNull)
      .privateIpAddresses(privateIpAddresses.map(_.asJava).orNull)
      .build()
}
