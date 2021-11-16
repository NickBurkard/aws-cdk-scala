package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayRouteTablePropagationProps {

  def apply(
    transitGatewayRouteTableId: String,
    transitGatewayAttachmentId: String
  ): software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagationProps =
    (new software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagationProps.Builder)
      .transitGatewayRouteTableId(transitGatewayRouteTableId)
      .transitGatewayAttachmentId(transitGatewayAttachmentId)
      .build()
}
