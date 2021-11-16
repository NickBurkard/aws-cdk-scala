package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScheduledTaskImageProps {

  def apply(
    image: software.amazon.awscdk.services.ecs.ContainerImage,
    secrets: Option[Map[String, _ <: software.amazon.awscdk.services.ecs.Secret]] = None,
    command: Option[List[String]] = None,
    logDriver: Option[software.amazon.awscdk.services.ecs.LogDriver] = None,
    environment: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.ecs.patterns.ScheduledTaskImageProps =
    (new software.amazon.awscdk.services.ecs.patterns.ScheduledTaskImageProps.Builder)
      .image(image)
      .secrets(secrets.map(_.asJava).orNull)
      .command(command.map(_.asJava).orNull)
      .logDriver(logDriver.orNull)
      .environment(environment.map(_.asJava).orNull)
      .build()
}
