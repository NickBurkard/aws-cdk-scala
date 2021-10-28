package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AccessLogProperty {

  def apply(
    file: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.FileAccessLogProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.AccessLogProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.AccessLogProperty.Builder)
      .file(file.orNull)
      .build()
}
