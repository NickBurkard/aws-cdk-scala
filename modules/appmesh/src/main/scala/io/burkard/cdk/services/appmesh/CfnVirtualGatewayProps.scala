package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVirtualGatewayProps {

  def apply(
    meshName: String,
    spec: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewaySpecProperty,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    meshOwner: Option[String] = None,
    virtualGatewayName: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGatewayProps =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGatewayProps.Builder)
      .meshName(meshName)
      .spec(spec)
      .tags(tags.map(_.asJava).orNull)
      .meshOwner(meshOwner.orNull)
      .virtualGatewayName(virtualGatewayName.orNull)
      .build()
}
