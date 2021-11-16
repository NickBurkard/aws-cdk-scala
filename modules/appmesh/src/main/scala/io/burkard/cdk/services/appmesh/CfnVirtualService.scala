package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVirtualService {

  def apply(
    internalResourceId: String,
    meshName: String,
    virtualServiceName: String,
    spec: software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceSpecProperty,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    meshOwner: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appmesh.CfnVirtualService =
    software.amazon.awscdk.services.appmesh.CfnVirtualService.Builder
      .create(stackCtx, internalResourceId)
      .meshName(meshName)
      .virtualServiceName(virtualServiceName)
      .spec(spec)
      .tags(tags.map(_.asJava).orNull)
      .meshOwner(meshOwner.orNull)
      .build()
}
