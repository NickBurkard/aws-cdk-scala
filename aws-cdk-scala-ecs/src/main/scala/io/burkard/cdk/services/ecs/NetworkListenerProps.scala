package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NetworkListenerProps {

  def apply(
    name: Option[String] = None,
    port: Option[Number] = None
  ): software.amazon.awscdk.services.ecs.patterns.NetworkListenerProps =
    (new software.amazon.awscdk.services.ecs.patterns.NetworkListenerProps.Builder)
      .name(name.orNull)
      .port(port.orNull)
      .build()
}
