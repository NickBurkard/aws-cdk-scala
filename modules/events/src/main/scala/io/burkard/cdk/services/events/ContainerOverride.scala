package io.burkard.cdk.services.events

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ContainerOverride {

  def apply(
    containerName: String,
    memoryLimit: Option[Number] = None,
    command: Option[List[String]] = None,
    memoryReservation: Option[Number] = None,
    cpu: Option[Number] = None,
    environment: Option[List[_ <: software.amazon.awscdk.services.events.targets.TaskEnvironmentVariable]] = None
  ): software.amazon.awscdk.services.events.targets.ContainerOverride =
    (new software.amazon.awscdk.services.events.targets.ContainerOverride.Builder)
      .containerName(containerName)
      .memoryLimit(memoryLimit.orNull)
      .command(command.map(_.asJava).orNull)
      .memoryReservation(memoryReservation.orNull)
      .cpu(cpu.orNull)
      .environment(environment.map(_.asJava).orNull)
      .build()
}
