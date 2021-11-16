package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSecurityGroupEgress {

  def apply(
    internalResourceId: String,
    ipProtocol: String,
    groupId: String,
    toPort: Option[Number] = None,
    description: Option[String] = None,
    fromPort: Option[Number] = None,
    cidrIpv6: Option[String] = None,
    destinationSecurityGroupId: Option[String] = None,
    cidrIp: Option[String] = None,
    destinationPrefixListId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnSecurityGroupEgress =
    software.amazon.awscdk.services.ec2.CfnSecurityGroupEgress.Builder
      .create(stackCtx, internalResourceId)
      .ipProtocol(ipProtocol)
      .groupId(groupId)
      .toPort(toPort.orNull)
      .description(description.orNull)
      .fromPort(fromPort.orNull)
      .cidrIpv6(cidrIpv6.orNull)
      .destinationSecurityGroupId(destinationSecurityGroupId.orNull)
      .cidrIp(cidrIp.orNull)
      .destinationPrefixListId(destinationPrefixListId.orNull)
      .build()
}
