package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSubnetCidrBlockProps {

  def apply(
    subnetId: String,
    ipv6CidrBlock: String
  ): software.amazon.awscdk.services.ec2.CfnSubnetCidrBlockProps =
    (new software.amazon.awscdk.services.ec2.CfnSubnetCidrBlockProps.Builder)
      .subnetId(subnetId)
      .ipv6CidrBlock(ipv6CidrBlock)
      .build()
}
