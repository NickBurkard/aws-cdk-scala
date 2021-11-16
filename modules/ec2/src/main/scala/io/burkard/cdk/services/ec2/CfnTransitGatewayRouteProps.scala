package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayRouteProps {

  def apply(
    transitGatewayRouteTableId: String,
    transitGatewayAttachmentId: Option[String] = None,
    destinationCidrBlock: Option[String] = None,
    blackhole: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteProps =
    (new software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteProps.Builder)
      .transitGatewayRouteTableId(transitGatewayRouteTableId)
      .transitGatewayAttachmentId(transitGatewayAttachmentId.orNull)
      .destinationCidrBlock(destinationCidrBlock.orNull)
      .blackhole(blackhole.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
