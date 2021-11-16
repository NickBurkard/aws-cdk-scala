package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSubnetNetworkAclAssociation {

  def apply(
    internalResourceId: String,
    networkAclId: String,
    subnetId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation =
    software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation.Builder
      .create(stackCtx, internalResourceId)
      .networkAclId(networkAclId)
      .subnetId(subnetId)
      .build()
}
