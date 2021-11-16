package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGatewayRouteProps {

  def apply(
    meshName: String,
    spec: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteSpecProperty,
    virtualGatewayName: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    gatewayRouteName: Option[String] = None,
    meshOwner: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRouteProps =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRouteProps.Builder)
      .meshName(meshName)
      .spec(spec)
      .virtualGatewayName(virtualGatewayName)
      .tags(tags.map(_.asJava).orNull)
      .gatewayRouteName(gatewayRouteName.orNull)
      .meshOwner(meshOwner.orNull)
      .build()
}
