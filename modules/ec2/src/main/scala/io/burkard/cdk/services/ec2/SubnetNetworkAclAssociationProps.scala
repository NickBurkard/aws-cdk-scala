package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SubnetNetworkAclAssociationProps {

  def apply(
    networkAcl: Option[software.amazon.awscdk.services.ec2.INetworkAcl] = None,
    subnetNetworkAclAssociationName: Option[String] = None,
    subnet: Option[software.amazon.awscdk.services.ec2.ISubnet] = None
  ): software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps =
    (new software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps.Builder)
      .networkAcl(networkAcl.orNull)
      .subnetNetworkAclAssociationName(subnetNetworkAclAssociationName.orNull)
      .subnet(subnet.orNull)
      .build()
}
