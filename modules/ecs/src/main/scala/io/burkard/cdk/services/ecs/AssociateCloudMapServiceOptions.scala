package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssociateCloudMapServiceOptions {

  def apply(
    service: software.amazon.awscdk.services.servicediscovery.IService,
    containerPort: Option[Number] = None,
    container: Option[software.amazon.awscdk.services.ecs.ContainerDefinition] = None
  ): software.amazon.awscdk.services.ecs.AssociateCloudMapServiceOptions =
    (new software.amazon.awscdk.services.ecs.AssociateCloudMapServiceOptions.Builder)
      .service(service)
      .containerPort(containerPort.orNull)
      .container(container.orNull)
      .build()
}
