package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ContainerOverride {

  def apply(
    containerDefinition: software.amazon.awscdk.services.ecs.ContainerDefinition,
    memoryLimit: Option[Number] = None,
    command: Option[List[String]] = None,
    memoryReservation: Option[Number] = None,
    cpu: Option[Number] = None,
    environment: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.TaskEnvironmentVariable]] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride =
    (new software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride.Builder)
      .containerDefinition(containerDefinition)
      .memoryLimit(memoryLimit.orNull)
      .command(command.map(_.asJava).orNull)
      .memoryReservation(memoryReservation.orNull)
      .cpu(cpu.orNull)
      .environment(environment.map(_.asJava).orNull)
      .build()
}
