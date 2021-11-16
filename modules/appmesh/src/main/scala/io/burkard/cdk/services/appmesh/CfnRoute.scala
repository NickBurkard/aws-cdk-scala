package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRoute {

  def apply(
    internalResourceId: String,
    meshName: String,
    virtualRouterName: String,
    spec: software.amazon.awscdk.services.appmesh.CfnRoute.RouteSpecProperty,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    routeName: Option[String] = None,
    meshOwner: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appmesh.CfnRoute =
    software.amazon.awscdk.services.appmesh.CfnRoute.Builder
      .create(stackCtx, internalResourceId)
      .meshName(meshName)
      .virtualRouterName(virtualRouterName)
      .spec(spec)
      .tags(tags.map(_.asJava).orNull)
      .routeName(routeName.orNull)
      .meshOwner(meshOwner.orNull)
      .build()
}
