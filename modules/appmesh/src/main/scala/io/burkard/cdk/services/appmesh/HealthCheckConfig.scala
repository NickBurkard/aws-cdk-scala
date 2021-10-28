package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HealthCheckConfig {

  def apply(
    virtualNodeHealthCheck: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.HealthCheckProperty] = None,
    virtualGatewayHealthCheck: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty] = None
  ): software.amazon.awscdk.services.appmesh.HealthCheckConfig =
    (new software.amazon.awscdk.services.appmesh.HealthCheckConfig.Builder)
      .virtualNodeHealthCheck(virtualNodeHealthCheck.orNull)
      .virtualGatewayHealthCheck(virtualGatewayHealthCheck.orNull)
      .build()
}
