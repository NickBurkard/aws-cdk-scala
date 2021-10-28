package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PortMappingProperty {

  def apply(
    containerPort: Option[Number] = None,
    hostPort: Option[Number] = None,
    protocol: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.PortMappingProperty.Builder)
      .containerPort(containerPort.orNull)
      .hostPort(hostPort.orNull)
      .protocol(protocol.orNull)
      .build()
}
