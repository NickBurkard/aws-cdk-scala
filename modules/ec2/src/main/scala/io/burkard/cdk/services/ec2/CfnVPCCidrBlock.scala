package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVPCCidrBlock {

  def apply(
    internalResourceId: String,
    amazonProvidedIpv6CidrBlock: Option[Boolean] = None,
    vpcId: Option[String] = None,
    ipv6Pool: Option[String] = None,
    cidrBlock: Option[String] = None,
    ipv6CidrBlock: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnVPCCidrBlock =
    software.amazon.awscdk.services.ec2.CfnVPCCidrBlock.Builder
      .create(stackCtx, internalResourceId)
      .amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpcId(vpcId.orNull)
      .ipv6Pool(ipv6Pool.orNull)
      .cidrBlock(cidrBlock.orNull)
      .ipv6CidrBlock(ipv6CidrBlock.orNull)
      .build()
}
