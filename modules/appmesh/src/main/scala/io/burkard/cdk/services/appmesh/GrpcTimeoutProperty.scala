package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GrpcTimeoutProperty {

  def apply(
    perRequest: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.DurationProperty] = None,
    idle: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.DurationProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.GrpcTimeoutProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.GrpcTimeoutProperty.Builder)
      .perRequest(perRequest.orNull)
      .idle(idle.orNull)
      .build()
}
