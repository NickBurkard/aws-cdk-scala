package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualGatewayListenerProperty {

  def apply(
    portMapping: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayPortMappingProperty,
    healthCheck: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty] = None,
    connectionPool: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayConnectionPoolProperty] = None,
    tls: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerTlsProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerProperty.Builder)
      .portMapping(portMapping)
      .healthCheck(healthCheck.orNull)
      .connectionPool(connectionPool.orNull)
      .tls(tls.orNull)
      .build()
}
