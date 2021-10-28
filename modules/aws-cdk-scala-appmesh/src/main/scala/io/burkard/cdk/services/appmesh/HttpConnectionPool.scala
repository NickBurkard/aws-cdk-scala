package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpConnectionPool {

  def apply(
    maxConnections: Option[Number] = None,
    maxPendingRequests: Option[Number] = None
  ): software.amazon.awscdk.services.appmesh.HttpConnectionPool =
    (new software.amazon.awscdk.services.appmesh.HttpConnectionPool.Builder)
      .maxConnections(maxConnections.orNull)
      .maxPendingRequests(maxPendingRequests.orNull)
      .build()
}
