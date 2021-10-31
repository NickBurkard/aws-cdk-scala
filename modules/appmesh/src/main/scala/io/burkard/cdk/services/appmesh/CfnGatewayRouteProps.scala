package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnGatewayRouteProps {

  def apply(
    meshName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    gatewayRouteName: Option[String] = None,
    spec: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteSpecProperty] = None,
    meshOwner: Option[String] = None,
    virtualGatewayName: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRouteProps =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRouteProps.Builder)
      .meshName(meshName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .gatewayRouteName(gatewayRouteName.orNull)
      .spec(spec.orNull)
      .meshOwner(meshOwner.orNull)
      .virtualGatewayName(virtualGatewayName.orNull)
      .build()
}
