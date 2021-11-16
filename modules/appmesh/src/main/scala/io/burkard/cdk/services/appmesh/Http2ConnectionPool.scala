package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Http2ConnectionPool {

  def apply(
    maxRequests: Number
  ): software.amazon.awscdk.services.appmesh.Http2ConnectionPool =
    (new software.amazon.awscdk.services.appmesh.Http2ConnectionPool.Builder)
      .maxRequests(maxRequests)
      .build()
}
