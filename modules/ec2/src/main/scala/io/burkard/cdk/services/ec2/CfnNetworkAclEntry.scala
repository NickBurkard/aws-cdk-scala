package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNetworkAclEntry {

  def apply(
    internalResourceId: String,
    portRange: Option[software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.PortRangeProperty] = None,
    networkAclId: Option[String] = None,
    icmp: Option[software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.IcmpProperty] = None,
    cidrBlock: Option[String] = None,
    egress: Option[Boolean] = None,
    ipv6CidrBlock: Option[String] = None,
    ruleNumber: Option[Number] = None,
    ruleAction: Option[String] = None,
    protocol: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnNetworkAclEntry =
    software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.Builder
      .create(stackCtx, internalResourceId)
      .portRange(portRange.orNull)
      .networkAclId(networkAclId.orNull)
      .icmp(icmp.orNull)
      .cidrBlock(cidrBlock.orNull)
      .egress(egress.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ipv6CidrBlock(ipv6CidrBlock.orNull)
      .ruleNumber(ruleNumber.orNull)
      .ruleAction(ruleAction.orNull)
      .protocol(protocol.orNull)
      .build()
}
