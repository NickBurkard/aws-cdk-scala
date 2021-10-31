package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSubnetCidrBlock {

  def apply(
    internalResourceId: String,
    subnetId: Option[String] = None,
    ipv6CidrBlock: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnSubnetCidrBlock =
    software.amazon.awscdk.services.ec2.CfnSubnetCidrBlock.Builder
      .create(stackCtx, internalResourceId)
      .subnetId(subnetId.orNull)
      .ipv6CidrBlock(ipv6CidrBlock.orNull)
      .build()
}
