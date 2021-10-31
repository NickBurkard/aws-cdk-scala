package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpTimeoutProperty {

  def apply(
    perRequest: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.DurationProperty] = None,
    idle: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.DurationProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.HttpTimeoutProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.HttpTimeoutProperty.Builder)
      .perRequest(perRequest.orNull)
      .idle(idle.orNull)
      .build()
}
