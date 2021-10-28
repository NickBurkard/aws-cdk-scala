package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HealthCheckBindOptions {

  def apply(
    defaultPort: Option[Number] = None
  ): software.amazon.awscdk.services.appmesh.HealthCheckBindOptions =
    (new software.amazon.awscdk.services.appmesh.HealthCheckBindOptions.Builder)
      .defaultPort(defaultPort.orNull)
      .build()
}
