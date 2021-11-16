package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationLoadBalancedTaskImageProps {

  def apply(
    image: software.amazon.awscdk.services.ecs.ContainerImage,
    containerName: Option[String] = None,
    secrets: Option[Map[String, _ <: software.amazon.awscdk.services.ecs.Secret]] = None,
    taskRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    logDriver: Option[software.amazon.awscdk.services.ecs.LogDriver] = None,
    containerPorts: Option[List[_ <: Number]] = None,
    enableLogging: Option[Boolean] = None,
    environment: Option[Map[String, String]] = None,
    dockerLabels: Option[Map[String, String]] = None,
    family: Option[String] = None,
    executionRole: Option[software.amazon.awscdk.services.iam.IRole] = None
  ): software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageProps =
    (new software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageProps.Builder)
      .image(image)
      .containerName(containerName.orNull)
      .secrets(secrets.map(_.asJava).orNull)
      .taskRole(taskRole.orNull)
      .logDriver(logDriver.orNull)
      .containerPorts(containerPorts.map(_.asJava).orNull)
      .enableLogging(enableLogging.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .environment(environment.map(_.asJava).orNull)
      .dockerLabels(dockerLabels.map(_.asJava).orNull)
      .family(family.orNull)
      .executionRole(executionRole.orNull)
      .build()
}
