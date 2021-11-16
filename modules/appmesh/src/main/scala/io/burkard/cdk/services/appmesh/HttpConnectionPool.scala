package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpConnectionPool {

  def apply(
    maxConnections: Number,
    maxPendingRequests: Number
  ): software.amazon.awscdk.services.appmesh.HttpConnectionPool =
    (new software.amazon.awscdk.services.appmesh.HttpConnectionPool.Builder)
      .maxConnections(maxConnections)
      .maxPendingRequests(maxPendingRequests)
      .build()
}
