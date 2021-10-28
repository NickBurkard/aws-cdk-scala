package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTransitGatewayRouteProps {

  def apply(
    transitGatewayRouteTableId: Option[String] = None,
    transitGatewayAttachmentId: Option[String] = None,
    destinationCidrBlock: Option[String] = None,
    blackhole: Option[Boolean] = None
  ): software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteProps =
    (new software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteProps.Builder)
      .transitGatewayRouteTableId(transitGatewayRouteTableId.orNull)
      .transitGatewayAttachmentId(transitGatewayAttachmentId.orNull)
      .destinationCidrBlock(destinationCidrBlock.orNull)
      .blackhole(blackhole.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
