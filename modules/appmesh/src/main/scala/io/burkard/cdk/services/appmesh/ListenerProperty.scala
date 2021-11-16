package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ListenerProperty {

  def apply(
    portMapping: software.amazon.awscdk.services.appmesh.CfnVirtualNode.PortMappingProperty,
    healthCheck: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.HealthCheckProperty] = None,
    connectionPool: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeConnectionPoolProperty] = None,
    outlierDetection: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.OutlierDetectionProperty] = None,
    tls: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsProperty] = None,
    timeout: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTimeoutProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerProperty.Builder)
      .portMapping(portMapping)
      .healthCheck(healthCheck.orNull)
      .connectionPool(connectionPool.orNull)
      .outlierDetection(outlierDetection.orNull)
      .tls(tls.orNull)
      .timeout(timeout.orNull)
      .build()
}
