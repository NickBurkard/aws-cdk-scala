package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVPCGatewayAttachment {

  def apply(
    internalResourceId: String,
    vpcId: String,
    vpnGatewayId: Option[String] = None,
    internetGatewayId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachment =
    software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachment.Builder
      .create(stackCtx, internalResourceId)
      .vpcId(vpcId)
      .vpnGatewayId(vpnGatewayId.orNull)
      .internetGatewayId(internetGatewayId.orNull)
      .build()
}
