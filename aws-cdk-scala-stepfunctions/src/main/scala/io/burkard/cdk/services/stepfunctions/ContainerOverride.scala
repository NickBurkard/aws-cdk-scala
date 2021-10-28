package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ContainerOverride {

  def apply(
    containerDefinition: Option[software.amazon.awscdk.services.ecs.ContainerDefinition] = None,
    memoryLimit: Option[Number] = None,
    command: Option[List[String]] = None,
    memoryReservation: Option[Number] = None,
    cpu: Option[Number] = None,
    environment: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.TaskEnvironmentVariable]] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride =
    (new software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride.Builder)
      .containerDefinition(containerDefinition.orNull)
      .memoryLimit(memoryLimit.orNull)
      .command(command.map(_.asJava).orNull)
      .memoryReservation(memoryReservation.orNull)
      .cpu(cpu.orNull)
      .environment(environment.map(_.asJava).orNull)
      .build()
}
