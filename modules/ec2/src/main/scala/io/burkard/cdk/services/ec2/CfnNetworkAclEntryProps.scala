package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNetworkAclEntryProps {

  def apply(
    networkAclId: String,
    ruleNumber: Number,
    ruleAction: String,
    protocol: Number,
    portRange: Option[software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.PortRangeProperty] = None,
    icmp: Option[software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.IcmpProperty] = None,
    cidrBlock: Option[String] = None,
    egress: Option[Boolean] = None,
    ipv6CidrBlock: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnNetworkAclEntryProps =
    (new software.amazon.awscdk.services.ec2.CfnNetworkAclEntryProps.Builder)
      .networkAclId(networkAclId)
      .ruleNumber(ruleNumber)
      .ruleAction(ruleAction)
      .protocol(protocol)
      .portRange(portRange.orNull)
      .icmp(icmp.orNull)
      .cidrBlock(cidrBlock.orNull)
      .egress(egress.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ipv6CidrBlock(ipv6CidrBlock.orNull)
      .build()
}
