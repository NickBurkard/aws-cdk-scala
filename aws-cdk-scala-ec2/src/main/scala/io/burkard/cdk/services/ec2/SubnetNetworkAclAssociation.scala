package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SubnetNetworkAclAssociation {

  def apply(
    internalResourceId: String,
    networkAcl: Option[software.amazon.awscdk.services.ec2.INetworkAcl] = None,
    subnetNetworkAclAssociationName: Option[String] = None,
    subnet: Option[software.amazon.awscdk.services.ec2.ISubnet] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation =
    software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation.Builder
      .create(stackCtx, internalResourceId)
      .networkAcl(networkAcl.orNull)
      .subnetNetworkAclAssociationName(subnetNetworkAclAssociationName.orNull)
      .subnet(subnet.orNull)
      .build()
}
