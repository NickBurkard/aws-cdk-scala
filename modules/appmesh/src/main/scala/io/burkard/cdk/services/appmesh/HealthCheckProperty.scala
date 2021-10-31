package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HealthCheckProperty {

  def apply(
    intervalMillis: Option[Number] = None,
    path: Option[String] = None,
    timeoutMillis: Option[Number] = None,
    port: Option[Number] = None,
    protocol: Option[String] = None,
    healthyThreshold: Option[Number] = None,
    unhealthyThreshold: Option[Number] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.HealthCheckProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.HealthCheckProperty.Builder)
      .intervalMillis(intervalMillis.orNull)
      .path(path.orNull)
      .timeoutMillis(timeoutMillis.orNull)
      .port(port.orNull)
      .protocol(protocol.orNull)
      .healthyThreshold(healthyThreshold.orNull)
      .unhealthyThreshold(unhealthyThreshold.orNull)
      .build()
}
