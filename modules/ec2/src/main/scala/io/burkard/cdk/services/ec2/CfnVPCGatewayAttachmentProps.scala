package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVPCGatewayAttachmentProps {

  def apply(
    vpcId: String,
    vpnGatewayId: Option[String] = None,
    internetGatewayId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachmentProps =
    (new software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachmentProps.Builder)
      .vpcId(vpcId)
      .vpnGatewayId(vpnGatewayId.orNull)
      .internetGatewayId(internetGatewayId.orNull)
      .build()
}
