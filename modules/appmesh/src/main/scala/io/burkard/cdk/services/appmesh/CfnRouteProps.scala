package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRouteProps {

  def apply(
    meshName: Option[String] = None,
    virtualRouterName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    spec: Option[software.amazon.awscdk.services.appmesh.CfnRoute.RouteSpecProperty] = None,
    routeName: Option[String] = None,
    meshOwner: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnRouteProps =
    (new software.amazon.awscdk.services.appmesh.CfnRouteProps.Builder)
      .meshName(meshName.orNull)
      .virtualRouterName(virtualRouterName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .spec(spec.orNull)
      .routeName(routeName.orNull)
      .meshOwner(meshOwner.orNull)
      .build()
}
