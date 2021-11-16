package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HealthCheckProperty {

  def apply(
    intervalMillis: Number,
    timeoutMillis: Number,
    protocol: String,
    healthyThreshold: Number,
    unhealthyThreshold: Number,
    path: Option[String] = None,
    port: Option[Number] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.HealthCheckProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.HealthCheckProperty.Builder)
      .intervalMillis(intervalMillis)
      .timeoutMillis(timeoutMillis)
      .protocol(protocol)
      .healthyThreshold(healthyThreshold)
      .unhealthyThreshold(unhealthyThreshold)
      .path(path.orNull)
      .port(port.orNull)
      .build()
}
