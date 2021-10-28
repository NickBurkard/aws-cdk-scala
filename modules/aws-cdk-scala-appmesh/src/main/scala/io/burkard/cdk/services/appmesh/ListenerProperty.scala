package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ListenerProperty {

  def apply(
    healthCheck: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.HealthCheckProperty] = None,
    connectionPool: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualNodeConnectionPoolProperty] = None,
    outlierDetection: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.OutlierDetectionProperty] = None,
    tls: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTlsProperty] = None,
    portMapping: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.PortMappingProperty] = None,
    timeout: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerTimeoutProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerProperty.Builder)
      .healthCheck(healthCheck.orNull)
      .connectionPool(connectionPool.orNull)
      .outlierDetection(outlierDetection.orNull)
      .tls(tls.orNull)
      .portMapping(portMapping.orNull)
      .timeout(timeout.orNull)
      .build()
}
