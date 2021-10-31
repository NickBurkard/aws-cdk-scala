package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVirtualNode {

  def apply(
    internalResourceId: String,
    meshName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    spec: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeSpecProperty] = None,
    meshOwner: Option[String] = None,
    virtualNodeName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appmesh.CfnVirtualNode =
    software.amazon.awscdk.services.appmesh.CfnVirtualNode.Builder
      .create(stackCtx, internalResourceId)
      .meshName(meshName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .spec(spec.orNull)
      .meshOwner(meshOwner.orNull)
      .virtualNodeName(virtualNodeName.orNull)
      .build()
}
