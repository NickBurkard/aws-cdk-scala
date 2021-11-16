package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRouteProps {

  def apply(
    meshName: String,
    virtualRouterName: String,
    spec: software.amazon.awscdk.services.appmesh.CfnRoute.RouteSpecProperty,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    routeName: Option[String] = None,
    meshOwner: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnRouteProps =
    (new software.amazon.awscdk.services.appmesh.CfnRouteProps.Builder)
      .meshName(meshName)
      .virtualRouterName(virtualRouterName)
      .spec(spec)
      .tags(tags.map(_.asJava).orNull)
      .routeName(routeName.orNull)
      .meshOwner(meshOwner.orNull)
      .build()
}
