package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpVirtualNodeListenerOptions {

  def apply(
    healthCheck: Option[software.amazon.awscdk.services.appmesh.HealthCheck] = None,
    connectionPool: Option[software.amazon.awscdk.services.appmesh.HttpConnectionPool] = None,
    outlierDetection: Option[software.amazon.awscdk.services.appmesh.OutlierDetection] = None,
    tls: Option[software.amazon.awscdk.services.appmesh.ListenerTlsOptions] = None,
    port: Option[Number] = None,
    timeout: Option[software.amazon.awscdk.services.appmesh.HttpTimeout] = None
  ): software.amazon.awscdk.services.appmesh.HttpVirtualNodeListenerOptions =
    (new software.amazon.awscdk.services.appmesh.HttpVirtualNodeListenerOptions.Builder)
      .healthCheck(healthCheck.orNull)
      .connectionPool(connectionPool.orNull)
      .outlierDetection(outlierDetection.orNull)
      .tls(tls.orNull)
      .port(port.orNull)
      .timeout(timeout.orNull)
      .build()
}
