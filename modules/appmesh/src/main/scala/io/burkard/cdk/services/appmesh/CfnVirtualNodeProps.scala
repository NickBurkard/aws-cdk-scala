package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVirtualNodeProps {

  def apply(
    meshName: String,
    spec: software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeSpecProperty,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    meshOwner: Option[String] = None,
    virtualNodeName: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNodeProps =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNodeProps.Builder)
      .meshName(meshName)
      .spec(spec)
      .tags(tags.map(_.asJava).orNull)
      .meshOwner(meshOwner.orNull)
      .virtualNodeName(virtualNodeName.orNull)
      .build()
}
