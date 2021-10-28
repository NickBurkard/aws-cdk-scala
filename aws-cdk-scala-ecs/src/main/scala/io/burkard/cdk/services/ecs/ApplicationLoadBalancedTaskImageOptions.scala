package io.burkard.cdk.services.ecs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ApplicationLoadBalancedTaskImageOptions {

  def apply(
    containerName: Option[String] = None,
    containerPort: Option[Number] = None,
    secrets: Option[Map[String, _ <: software.amazon.awscdk.services.ecs.Secret]] = None,
    taskRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    logDriver: Option[software.amazon.awscdk.services.ecs.LogDriver] = None,
    enableLogging: Option[Boolean] = None,
    environment: Option[Map[String, String]] = None,
    dockerLabels: Option[Map[String, String]] = None,
    family: Option[String] = None,
    image: Option[software.amazon.awscdk.services.ecs.ContainerImage] = None,
    executionRole: Option[software.amazon.awscdk.services.iam.IRole] = None
  ): software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions =
    (new software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageOptions.Builder)
      .containerName(containerName.orNull)
      .containerPort(containerPort.orNull)
      .secrets(secrets.map(_.asJava).orNull)
      .taskRole(taskRole.orNull)
      .logDriver(logDriver.orNull)
      .enableLogging(enableLogging.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .environment(environment.map(_.asJava).orNull)
      .dockerLabels(dockerLabels.map(_.asJava).orNull)
      .family(family.orNull)
      .image(image.orNull)
      .executionRole(executionRole.orNull)
      .build()
}
