package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVirtualRouter {

  def apply(
    internalResourceId: String,
    meshName: String,
    spec: software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterSpecProperty,
    virtualRouterName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    meshOwner: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appmesh.CfnVirtualRouter =
    software.amazon.awscdk.services.appmesh.CfnVirtualRouter.Builder
      .create(stackCtx, internalResourceId)
      .meshName(meshName)
      .spec(spec)
      .virtualRouterName(virtualRouterName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .meshOwner(meshOwner.orNull)
      .build()
}
