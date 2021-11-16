package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EgressProperty {

  def apply(
    ipProtocol: String,
    toPort: Option[Number] = None,
    description: Option[String] = None,
    fromPort: Option[Number] = None,
    cidrIpv6: Option[String] = None,
    destinationSecurityGroupId: Option[String] = None,
    cidrIp: Option[String] = None,
    destinationPrefixListId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnSecurityGroup.EgressProperty =
    (new software.amazon.awscdk.services.ec2.CfnSecurityGroup.EgressProperty.Builder)
      .ipProtocol(ipProtocol)
      .toPort(toPort.orNull)
      .description(description.orNull)
      .fromPort(fromPort.orNull)
      .cidrIpv6(cidrIpv6.orNull)
      .destinationSecurityGroupId(destinationSecurityGroupId.orNull)
      .cidrIp(cidrIp.orNull)
      .destinationPrefixListId(destinationPrefixListId.orNull)
      .build()
}
