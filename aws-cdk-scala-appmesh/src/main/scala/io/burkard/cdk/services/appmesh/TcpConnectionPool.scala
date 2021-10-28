package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TcpConnectionPool {

  def apply(
    maxConnections: Option[Number] = None
  ): software.amazon.awscdk.services.appmesh.TcpConnectionPool =
    (new software.amazon.awscdk.services.appmesh.TcpConnectionPool.Builder)
      .maxConnections(maxConnections.orNull)
      .build()
}
