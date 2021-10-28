package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PortMapping {

  def apply(
    containerPort: Option[Number] = None,
    hostPort: Option[Number] = None,
    protocol: Option[software.amazon.awscdk.services.ecs.Protocol] = None
  ): software.amazon.awscdk.services.ecs.PortMapping =
    (new software.amazon.awscdk.services.ecs.PortMapping.Builder)
      .containerPort(containerPort.orNull)
      .hostPort(hostPort.orNull)
      .protocol(protocol.orNull)
      .build()
}
