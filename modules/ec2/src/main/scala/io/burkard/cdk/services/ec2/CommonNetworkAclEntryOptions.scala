package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CommonNetworkAclEntryOptions {

  def apply(
    traffic: software.amazon.awscdk.services.ec2.AclTraffic,
    ruleNumber: Number,
    cidr: software.amazon.awscdk.services.ec2.AclCidr,
    direction: Option[software.amazon.awscdk.services.ec2.TrafficDirection] = None,
    ruleAction: Option[software.amazon.awscdk.services.ec2.Action] = None,
    networkAclEntryName: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CommonNetworkAclEntryOptions =
    (new software.amazon.awscdk.services.ec2.CommonNetworkAclEntryOptions.Builder)
      .traffic(traffic)
      .ruleNumber(ruleNumber)
      .cidr(cidr)
      .direction(direction.orNull)
      .ruleAction(ruleAction.orNull)
      .networkAclEntryName(networkAclEntryName.orNull)
      .build()
}
