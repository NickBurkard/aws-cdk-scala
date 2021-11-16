package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubnetNetworkAclAssociationProps {

  def apply(
    networkAcl: software.amazon.awscdk.services.ec2.INetworkAcl,
    subnet: software.amazon.awscdk.services.ec2.ISubnet,
    subnetNetworkAclAssociationName: Option[String] = None
  ): software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps =
    (new software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps.Builder)
      .networkAcl(networkAcl)
      .subnet(subnet)
      .subnetNetworkAclAssociationName(subnetNetworkAclAssociationName.orNull)
      .build()
}
