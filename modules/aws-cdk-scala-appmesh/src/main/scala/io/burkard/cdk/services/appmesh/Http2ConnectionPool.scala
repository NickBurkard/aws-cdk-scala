package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Http2ConnectionPool {

  def apply(
    maxRequests: Option[Number] = None
  ): software.amazon.awscdk.services.appmesh.Http2ConnectionPool =
    (new software.amazon.awscdk.services.appmesh.Http2ConnectionPool.Builder)
      .maxRequests(maxRequests.orNull)
      .build()
}
