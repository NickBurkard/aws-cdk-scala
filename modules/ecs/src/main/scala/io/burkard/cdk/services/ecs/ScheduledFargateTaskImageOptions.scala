package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScheduledFargateTaskImageOptions {

  def apply(
    memoryLimitMiB: Option[Number] = None,
    secrets: Option[Map[String, _ <: software.amazon.awscdk.services.ecs.Secret]] = None,
    image: Option[software.amazon.awscdk.services.ecs.ContainerImage] = None,
    command: Option[List[String]] = None,
    logDriver: Option[software.amazon.awscdk.services.ecs.LogDriver] = None,
    cpu: Option[Number] = None,
    environment: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskImageOptions =
    (new software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskImageOptions.Builder)
      .memoryLimitMiB(memoryLimitMiB.orNull)
      .secrets(secrets.map(_.asJava).orNull)
      .image(image.orNull)
      .command(command.map(_.asJava).orNull)
      .logDriver(logDriver.orNull)
      .cpu(cpu.orNull)
      .environment(environment.map(_.asJava).orNull)
      .build()
}
