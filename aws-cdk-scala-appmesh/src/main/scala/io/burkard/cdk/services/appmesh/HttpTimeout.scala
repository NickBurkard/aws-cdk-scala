package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpTimeout {

  def apply(
    perRequest: Option[software.amazon.awscdk.Duration] = None,
    idle: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.appmesh.HttpTimeout =
    (new software.amazon.awscdk.services.appmesh.HttpTimeout.Builder)
      .perRequest(perRequest.orNull)
      .idle(idle.orNull)
      .build()
}
