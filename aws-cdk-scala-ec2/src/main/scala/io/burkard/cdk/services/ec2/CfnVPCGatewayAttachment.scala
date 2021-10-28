package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVPCGatewayAttachment {

  def apply(
    internalResourceId: String,
    vpnGatewayId: Option[String] = None,
    vpcId: Option[String] = None,
    internetGatewayId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachment =
    software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachment.Builder
      .create(stackCtx, internalResourceId)
      .vpnGatewayId(vpnGatewayId.orNull)
      .vpcId(vpcId.orNull)
      .internetGatewayId(internetGatewayId.orNull)
      .build()
}
