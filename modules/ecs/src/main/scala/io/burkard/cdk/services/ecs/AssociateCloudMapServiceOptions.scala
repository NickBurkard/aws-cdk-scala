package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssociateCloudMapServiceOptions {

  def apply(
    containerPort: Option[Number] = None,
    container: Option[software.amazon.awscdk.services.ecs.ContainerDefinition] = None,
    service: Option[software.amazon.awscdk.services.servicediscovery.IService] = None
  ): software.amazon.awscdk.services.ecs.AssociateCloudMapServiceOptions =
    (new software.amazon.awscdk.services.ecs.AssociateCloudMapServiceOptions.Builder)
      .containerPort(containerPort.orNull)
      .container(container.orNull)
      .service(service.orNull)
      .build()
}
