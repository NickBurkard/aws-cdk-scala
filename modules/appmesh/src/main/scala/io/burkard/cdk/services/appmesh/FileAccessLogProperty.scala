package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FileAccessLogProperty {

  def apply(
    path: String
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.FileAccessLogProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.FileAccessLogProperty.Builder)
      .path(path)
      .build()
}
