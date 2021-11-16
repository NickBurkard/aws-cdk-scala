package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSubnetNetworkAclAssociationProps {

  def apply(
    networkAclId: String,
    subnetId: String
  ): software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociationProps =
    (new software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociationProps.Builder)
      .networkAclId(networkAclId)
      .subnetId(subnetId)
      .build()
}
