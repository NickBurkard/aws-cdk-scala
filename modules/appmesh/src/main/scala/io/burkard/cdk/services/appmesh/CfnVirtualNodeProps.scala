package io.burkard.cdk.services.appmesh

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVirtualNodeProps {

  def apply(
    meshName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    spec: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeSpecProperty] = None,
    meshOwner: Option[String] = None,
    virtualNodeName: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNodeProps =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNodeProps.Builder)
      .meshName(meshName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .spec(spec.orNull)
      .meshOwner(meshOwner.orNull)
      .virtualNodeName(virtualNodeName.orNull)
      .build()
}
