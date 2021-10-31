package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayRouteTableAssociationProps {

  def apply(
    transitGatewayRouteTableId: Option[String] = None,
    transitGatewayAttachmentId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociationProps =
    (new software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociationProps.Builder)
      .transitGatewayRouteTableId(transitGatewayRouteTableId.orNull)
      .transitGatewayAttachmentId(transitGatewayAttachmentId.orNull)
      .build()
}
