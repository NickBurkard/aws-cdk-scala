package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayRouteTableProps {

  def apply(
    transitGatewayId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableProps =
    (new software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableProps.Builder)
      .transitGatewayId(transitGatewayId)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
