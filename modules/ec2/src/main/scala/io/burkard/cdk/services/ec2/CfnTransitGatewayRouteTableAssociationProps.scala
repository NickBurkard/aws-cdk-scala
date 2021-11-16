package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayRouteTableAssociationProps {

  def apply(
    transitGatewayRouteTableId: String,
    transitGatewayAttachmentId: String
  ): software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociationProps =
    (new software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociationProps.Builder)
      .transitGatewayRouteTableId(transitGatewayRouteTableId)
      .transitGatewayAttachmentId(transitGatewayAttachmentId)
      .build()
}
