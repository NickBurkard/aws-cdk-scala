package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GrpcVirtualNodeListenerOptions {

  def apply(
    healthCheck: Option[software.amazon.awscdk.services.appmesh.HealthCheck] = None,
    connectionPool: Option[software.amazon.awscdk.services.appmesh.GrpcConnectionPool] = None,
    outlierDetection: Option[software.amazon.awscdk.services.appmesh.OutlierDetection] = None,
    tls: Option[software.amazon.awscdk.services.appmesh.ListenerTlsOptions] = None,
    port: Option[Number] = None,
    timeout: Option[software.amazon.awscdk.services.appmesh.GrpcTimeout] = None
  ): software.amazon.awscdk.services.appmesh.GrpcVirtualNodeListenerOptions =
    (new software.amazon.awscdk.services.appmesh.GrpcVirtualNodeListenerOptions.Builder)
      .healthCheck(healthCheck.orNull)
      .connectionPool(connectionPool.orNull)
      .outlierDetection(outlierDetection.orNull)
      .tls(tls.orNull)
      .port(port.orNull)
      .timeout(timeout.orNull)
      .build()
}
