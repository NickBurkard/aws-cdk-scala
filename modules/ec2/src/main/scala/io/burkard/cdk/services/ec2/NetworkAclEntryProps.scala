package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NetworkAclEntryProps {

  def apply(
    networkAcl: Option[software.amazon.awscdk.services.ec2.INetworkAcl] = None,
    direction: Option[software.amazon.awscdk.services.ec2.TrafficDirection] = None,
    traffic: Option[software.amazon.awscdk.services.ec2.AclTraffic] = None,
    ruleNumber: Option[Number] = None,
    ruleAction: Option[software.amazon.awscdk.services.ec2.Action] = None,
    networkAclEntryName: Option[String] = None,
    cidr: Option[software.amazon.awscdk.services.ec2.AclCidr] = None
  ): software.amazon.awscdk.services.ec2.NetworkAclEntryProps =
    (new software.amazon.awscdk.services.ec2.NetworkAclEntryProps.Builder)
      .networkAcl(networkAcl.orNull)
      .direction(direction.orNull)
      .traffic(traffic.orNull)
      .ruleNumber(ruleNumber.orNull)
      .ruleAction(ruleAction.orNull)
      .networkAclEntryName(networkAclEntryName.orNull)
      .cidr(cidr.orNull)
      .build()
}
