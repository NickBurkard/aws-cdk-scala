package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GrpcTimeout {

  def apply(
    perRequest: Option[software.amazon.awscdk.Duration] = None,
    idle: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.appmesh.GrpcTimeout =
    (new software.amazon.awscdk.services.appmesh.GrpcTimeout.Builder)
      .perRequest(perRequest.orNull)
      .idle(idle.orNull)
      .build()
}
