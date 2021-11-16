package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PortMapping {

  def apply(
    containerPort: Number,
    hostPort: Option[Number] = None,
    protocol: Option[software.amazon.awscdk.services.ecs.Protocol] = None
  ): software.amazon.awscdk.services.ecs.PortMapping =
    (new software.amazon.awscdk.services.ecs.PortMapping.Builder)
      .containerPort(containerPort)
      .hostPort(hostPort.orNull)
      .protocol(protocol.orNull)
      .build()
}
