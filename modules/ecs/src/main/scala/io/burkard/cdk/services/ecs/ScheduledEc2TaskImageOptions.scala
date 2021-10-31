package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ScheduledEc2TaskImageOptions {

  def apply(
    memoryLimitMiB: Option[Number] = None,
    secrets: Option[Map[String, _ <: software.amazon.awscdk.services.ecs.Secret]] = None,
    image: Option[software.amazon.awscdk.services.ecs.ContainerImage] = None,
    command: Option[List[String]] = None,
    logDriver: Option[software.amazon.awscdk.services.ecs.LogDriver] = None,
    memoryReservationMiB: Option[Number] = None,
    cpu: Option[Number] = None,
    environment: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskImageOptions =
    (new software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskImageOptions.Builder)
      .memoryLimitMiB(memoryLimitMiB.orNull)
      .secrets(secrets.map(_.asJava).orNull)
      .image(image.orNull)
      .command(command.map(_.asJava).orNull)
      .logDriver(logDriver.orNull)
      .memoryReservationMiB(memoryReservationMiB.orNull)
      .cpu(cpu.orNull)
      .environment(environment.map(_.asJava).orNull)
      .build()
}
