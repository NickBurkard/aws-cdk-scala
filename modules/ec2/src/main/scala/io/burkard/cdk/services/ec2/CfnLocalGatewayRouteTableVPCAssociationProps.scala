package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLocalGatewayRouteTableVPCAssociationProps {

  def apply(
    vpcId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    localGatewayRouteTableId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociationProps =
    (new software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociationProps.Builder)
      .vpcId(vpcId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .localGatewayRouteTableId(localGatewayRouteTableId.orNull)
      .build()
}
