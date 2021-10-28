package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InstanceIpv6AddressProperty {

  def apply(
    ipv6Address: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceIpv6AddressProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.InstanceIpv6AddressProperty.Builder)
      .ipv6Address(ipv6Address.orNull)
      .build()
}
