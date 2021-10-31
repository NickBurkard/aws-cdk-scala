package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
