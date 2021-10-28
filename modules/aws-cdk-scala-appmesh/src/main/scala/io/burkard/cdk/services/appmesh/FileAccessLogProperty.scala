package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FileAccessLogProperty {

  def apply(
    path: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.FileAccessLogProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.FileAccessLogProperty.Builder)
      .path(path.orNull)
      .build()
}
