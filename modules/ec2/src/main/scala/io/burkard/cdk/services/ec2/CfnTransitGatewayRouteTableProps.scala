package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTransitGatewayRouteTableProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    transitGatewayId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableProps =
    (new software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .transitGatewayId(transitGatewayId.orNull)
      .build()
}
