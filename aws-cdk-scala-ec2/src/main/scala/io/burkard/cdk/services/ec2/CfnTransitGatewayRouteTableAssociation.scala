package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTransitGatewayRouteTableAssociation {

  def apply(
    internalResourceId: String,
    transitGatewayRouteTableId: Option[String] = None,
    transitGatewayAttachmentId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociation =
    software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociation.Builder
      .create(stackCtx, internalResourceId)
      .transitGatewayRouteTableId(transitGatewayRouteTableId.orNull)
      .transitGatewayAttachmentId(transitGatewayAttachmentId.orNull)
      .build()
}
