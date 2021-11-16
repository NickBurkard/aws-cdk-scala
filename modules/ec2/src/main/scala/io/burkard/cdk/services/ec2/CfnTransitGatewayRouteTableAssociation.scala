package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayRouteTableAssociation {

  def apply(
    internalResourceId: String,
    transitGatewayRouteTableId: String,
    transitGatewayAttachmentId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociation =
    software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociation.Builder
      .create(stackCtx, internalResourceId)
      .transitGatewayRouteTableId(transitGatewayRouteTableId)
      .transitGatewayAttachmentId(transitGatewayAttachmentId)
      .build()
}
