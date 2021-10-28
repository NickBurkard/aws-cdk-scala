package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ServiceRegistryProperty {

  def apply(
    containerName: Option[String] = None,
    containerPort: Option[Number] = None,
    port: Option[Number] = None,
    registryArn: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty =
    (new software.amazon.awscdk.services.ecs.CfnService.ServiceRegistryProperty.Builder)
      .containerName(containerName.orNull)
      .containerPort(containerPort.orNull)
      .port(port.orNull)
      .registryArn(registryArn.orNull)
      .build()
}
