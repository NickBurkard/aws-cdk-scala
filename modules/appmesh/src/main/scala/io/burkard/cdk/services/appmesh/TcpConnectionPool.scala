package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TcpConnectionPool {

  def apply(
    maxConnections: Number
  ): software.amazon.awscdk.services.appmesh.TcpConnectionPool =
    (new software.amazon.awscdk.services.appmesh.TcpConnectionPool.Builder)
      .maxConnections(maxConnections)
      .build()
}
