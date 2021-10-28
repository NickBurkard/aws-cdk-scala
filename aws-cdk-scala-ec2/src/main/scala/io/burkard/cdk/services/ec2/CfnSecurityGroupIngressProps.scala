package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSecurityGroupIngressProps {

  def apply(
    sourceSecurityGroupName: Option[String] = None,
    sourcePrefixListId: Option[String] = None,
    sourceSecurityGroupId: Option[String] = None,
    toPort: Option[Number] = None,
    description: Option[String] = None,
    sourceSecurityGroupOwnerId: Option[String] = None,
    ipProtocol: Option[String] = None,
    groupId: Option[String] = None,
    fromPort: Option[Number] = None,
    groupName: Option[String] = None,
    cidrIp: Option[String] = None,
    cidrIpv6: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnSecurityGroupIngressProps =
    (new software.amazon.awscdk.services.ec2.CfnSecurityGroupIngressProps.Builder)
      .sourceSecurityGroupName(sourceSecurityGroupName.orNull)
      .sourcePrefixListId(sourcePrefixListId.orNull)
      .sourceSecurityGroupId(sourceSecurityGroupId.orNull)
      .toPort(toPort.orNull)
      .description(description.orNull)
      .sourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId.orNull)
      .ipProtocol(ipProtocol.orNull)
      .groupId(groupId.orNull)
      .fromPort(fromPort.orNull)
      .groupName(groupName.orNull)
      .cidrIp(cidrIp.orNull)
      .cidrIpv6(cidrIpv6.orNull)
      .build()
}
