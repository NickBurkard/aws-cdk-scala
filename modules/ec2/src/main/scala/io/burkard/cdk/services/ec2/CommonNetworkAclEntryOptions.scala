package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CommonNetworkAclEntryOptions {

  def apply(
    direction: Option[software.amazon.awscdk.services.ec2.TrafficDirection] = None,
    traffic: Option[software.amazon.awscdk.services.ec2.AclTraffic] = None,
    ruleNumber: Option[Number] = None,
    ruleAction: Option[software.amazon.awscdk.services.ec2.Action] = None,
    networkAclEntryName: Option[String] = None,
    cidr: Option[software.amazon.awscdk.services.ec2.AclCidr] = None
  ): software.amazon.awscdk.services.ec2.CommonNetworkAclEntryOptions =
    (new software.amazon.awscdk.services.ec2.CommonNetworkAclEntryOptions.Builder)
      .direction(direction.orNull)
      .traffic(traffic.orNull)
      .ruleNumber(ruleNumber.orNull)
      .ruleAction(ruleAction.orNull)
      .networkAclEntryName(networkAclEntryName.orNull)
      .cidr(cidr.orNull)
      .build()
}
