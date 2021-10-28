package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLocalGatewayRouteTableVPCAssociation {

  def apply(
    internalResourceId: String,
    vpcId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    localGatewayRouteTableId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociation =
    software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociation.Builder
      .create(stackCtx, internalResourceId)
      .vpcId(vpcId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .localGatewayRouteTableId(localGatewayRouteTableId.orNull)
      .build()
}
