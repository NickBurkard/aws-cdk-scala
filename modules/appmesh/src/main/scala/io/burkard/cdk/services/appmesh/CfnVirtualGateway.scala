package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVirtualGateway {

  def apply(
    internalResourceId: String,
    meshName: String,
    spec: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewaySpecProperty,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    meshOwner: Option[String] = None,
    virtualGatewayName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appmesh.CfnVirtualGateway =
    software.amazon.awscdk.services.appmesh.CfnVirtualGateway.Builder
      .create(stackCtx, internalResourceId)
      .meshName(meshName)
      .spec(spec)
      .tags(tags.map(_.asJava).orNull)
      .meshOwner(meshOwner.orNull)
      .virtualGatewayName(virtualGatewayName.orNull)
      .build()
}
