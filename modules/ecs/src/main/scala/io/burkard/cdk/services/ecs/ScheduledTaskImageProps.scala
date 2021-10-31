package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ScheduledTaskImageProps {

  def apply(
    secrets: Option[Map[String, _ <: software.amazon.awscdk.services.ecs.Secret]] = None,
    image: Option[software.amazon.awscdk.services.ecs.ContainerImage] = None,
    command: Option[List[String]] = None,
    logDriver: Option[software.amazon.awscdk.services.ecs.LogDriver] = None,
    environment: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.ecs.patterns.ScheduledTaskImageProps =
    (new software.amazon.awscdk.services.ecs.patterns.ScheduledTaskImageProps.Builder)
      .secrets(secrets.map(_.asJava).orNull)
      .image(image.orNull)
      .command(command.map(_.asJava).orNull)
      .logDriver(logDriver.orNull)
      .environment(environment.map(_.asJava).orNull)
      .build()
}
