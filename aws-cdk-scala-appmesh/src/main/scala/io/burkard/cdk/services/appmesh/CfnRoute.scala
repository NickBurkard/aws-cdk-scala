package io.burkard.cdk.services.appmesh

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRoute {

  def apply(
    internalResourceId: String,
    meshName: Option[String] = None,
    virtualRouterName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    spec: Option[software.amazon.awscdk.services.appmesh.CfnRoute.RouteSpecProperty] = None,
    routeName: Option[String] = None,
    meshOwner: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appmesh.CfnRoute =
    software.amazon.awscdk.services.appmesh.CfnRoute.Builder
      .create(stackCtx, internalResourceId)
      .meshName(meshName.orNull)
      .virtualRouterName(virtualRouterName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .spec(spec.orNull)
      .routeName(routeName.orNull)
      .meshOwner(meshOwner.orNull)
      .build()
}
