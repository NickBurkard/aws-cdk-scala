package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSubnetNetworkAclAssociation {

  def apply(
    internalResourceId: String,
    networkAclId: Option[String] = None,
    subnetId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation =
    software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation.Builder
      .create(stackCtx, internalResourceId)
      .networkAclId(networkAclId.orNull)
      .subnetId(subnetId.orNull)
      .build()
}
