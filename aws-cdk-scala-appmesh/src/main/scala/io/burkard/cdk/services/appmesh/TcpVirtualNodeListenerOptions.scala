package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TcpVirtualNodeListenerOptions {

  def apply(
    healthCheck: Option[software.amazon.awscdk.services.appmesh.HealthCheck] = None,
    connectionPool: Option[software.amazon.awscdk.services.appmesh.TcpConnectionPool] = None,
    outlierDetection: Option[software.amazon.awscdk.services.appmesh.OutlierDetection] = None,
    tls: Option[software.amazon.awscdk.services.appmesh.ListenerTlsOptions] = None,
    port: Option[Number] = None,
    timeout: Option[software.amazon.awscdk.services.appmesh.TcpTimeout] = None
  ): software.amazon.awscdk.services.appmesh.TcpVirtualNodeListenerOptions =
    (new software.amazon.awscdk.services.appmesh.TcpVirtualNodeListenerOptions.Builder)
      .healthCheck(healthCheck.orNull)
      .connectionPool(connectionPool.orNull)
      .outlierDetection(outlierDetection.orNull)
      .tls(tls.orNull)
      .port(port.orNull)
      .timeout(timeout.orNull)
      .build()
}
