package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Http2VirtualNodeListenerOptions {

  def apply(
    healthCheck: Option[software.amazon.awscdk.services.appmesh.HealthCheck] = None,
    connectionPool: Option[software.amazon.awscdk.services.appmesh.Http2ConnectionPool] = None,
    outlierDetection: Option[software.amazon.awscdk.services.appmesh.OutlierDetection] = None,
    tls: Option[software.amazon.awscdk.services.appmesh.ListenerTlsOptions] = None,
    port: Option[Number] = None,
    timeout: Option[software.amazon.awscdk.services.appmesh.HttpTimeout] = None
  ): software.amazon.awscdk.services.appmesh.Http2VirtualNodeListenerOptions =
    (new software.amazon.awscdk.services.appmesh.Http2VirtualNodeListenerOptions.Builder)
      .healthCheck(healthCheck.orNull)
      .connectionPool(connectionPool.orNull)
      .outlierDetection(outlierDetection.orNull)
      .tls(tls.orNull)
      .port(port.orNull)
      .timeout(timeout.orNull)
      .build()
}
