package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVPCGatewayAttachmentProps {

  def apply(
    vpnGatewayId: Option[String] = None,
    vpcId: Option[String] = None,
    internetGatewayId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachmentProps =
    (new software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachmentProps.Builder)
      .vpnGatewayId(vpnGatewayId.orNull)
      .vpcId(vpcId.orNull)
      .internetGatewayId(internetGatewayId.orNull)
      .build()
}
