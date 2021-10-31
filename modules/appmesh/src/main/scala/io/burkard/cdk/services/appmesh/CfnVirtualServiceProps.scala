package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVirtualServiceProps {

  def apply(
    meshName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    meshOwner: Option[String] = None,
    virtualServiceName: Option[String] = None,
    spec: Option[software.amazon.awscdk.services.appmesh.CfnVirtualService.VirtualServiceSpecProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualServiceProps =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualServiceProps.Builder)
      .meshName(meshName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .meshOwner(meshOwner.orNull)
      .virtualServiceName(virtualServiceName.orNull)
      .spec(spec.orNull)
      .build()
}
