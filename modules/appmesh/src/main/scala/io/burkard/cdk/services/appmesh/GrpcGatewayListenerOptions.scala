package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GrpcGatewayListenerOptions {

  def apply(
    healthCheck: Option[software.amazon.awscdk.services.appmesh.HealthCheck] = None,
    connectionPool: Option[software.amazon.awscdk.services.appmesh.GrpcConnectionPool] = None,
    tls: Option[software.amazon.awscdk.services.appmesh.ListenerTlsOptions] = None,
    port: Option[Number] = None
  ): software.amazon.awscdk.services.appmesh.GrpcGatewayListenerOptions =
    (new software.amazon.awscdk.services.appmesh.GrpcGatewayListenerOptions.Builder)
      .healthCheck(healthCheck.orNull)
      .connectionPool(connectionPool.orNull)
      .tls(tls.orNull)
      .port(port.orNull)
      .build()
}
