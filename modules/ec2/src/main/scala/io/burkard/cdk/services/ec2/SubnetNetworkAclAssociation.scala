package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubnetNetworkAclAssociation {

  def apply(
    internalResourceId: String,
    networkAcl: software.amazon.awscdk.services.ec2.INetworkAcl,
    subnet: software.amazon.awscdk.services.ec2.ISubnet,
    subnetNetworkAclAssociationName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation =
    software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation.Builder
      .create(stackCtx, internalResourceId)
      .networkAcl(networkAcl)
      .subnet(subnet)
      .subnetNetworkAclAssociationName(subnetNetworkAclAssociationName.orNull)
      .build()
}
