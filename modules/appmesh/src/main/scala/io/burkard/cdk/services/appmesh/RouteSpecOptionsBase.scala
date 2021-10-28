package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RouteSpecOptionsBase {

  def apply(
    priority: Option[Number] = None
  ): software.amazon.awscdk.services.appmesh.RouteSpecOptionsBase =
    (new software.amazon.awscdk.services.appmesh.RouteSpecOptionsBase.Builder)
      .priority(priority.orNull)
      .build()
}
