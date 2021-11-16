package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GrpcConnectionPool {

  def apply(
    maxRequests: Number
  ): software.amazon.awscdk.services.appmesh.GrpcConnectionPool =
    (new software.amazon.awscdk.services.appmesh.GrpcConnectionPool.Builder)
      .maxRequests(maxRequests)
      .build()
}
