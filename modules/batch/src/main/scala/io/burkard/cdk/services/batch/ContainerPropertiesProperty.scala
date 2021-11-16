package io.burkard.cdk.services.batch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ContainerPropertiesProperty {

  def apply(
    image: String,
    vcpus: Option[Number] = None,
    secrets: Option[List[_]] = None,
    command: Option[List[String]] = None,
    linuxParameters: Option[software.amazon.awscdk.services.batch.CfnJobDefinition.LinuxParametersProperty] = None,
    resourceRequirements: Option[List[_]] = None,
    memory: Option[Number] = None,
    ulimits: Option[List[_]] = None,
    mountPoints: Option[List[_]] = None,
    networkConfiguration: Option[software.amazon.awscdk.services.batch.CfnJobDefinition.NetworkConfigurationProperty] = None,
    readonlyRootFilesystem: Option[Boolean] = None,
    instanceType: Option[String] = None,
    volumes: Option[List[_]] = None,
    executionRoleArn: Option[String] = None,
    environment: Option[List[_]] = None,
    privileged: Option[Boolean] = None,
    logConfiguration: Option[software.amazon.awscdk.services.batch.CfnJobDefinition.LogConfigurationProperty] = None,
    jobRoleArn: Option[String] = None,
    fargatePlatformConfiguration: Option[software.amazon.awscdk.services.batch.CfnJobDefinition.FargatePlatformConfigurationProperty] = None,
    user: Option[String] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.ContainerPropertiesProperty.Builder)
      .image(image)
      .vcpus(vcpus.orNull)
      .secrets(secrets.map(_.asJava).orNull)
      .command(command.map(_.asJava).orNull)
      .linuxParameters(linuxParameters.orNull)
      .resourceRequirements(resourceRequirements.map(_.asJava).orNull)
      .memory(memory.orNull)
      .ulimits(ulimits.map(_.asJava).orNull)
      .mountPoints(mountPoints.map(_.asJava).orNull)
      .networkConfiguration(networkConfiguration.orNull)
      .readonlyRootFilesystem(readonlyRootFilesystem.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .instanceType(instanceType.orNull)
      .volumes(volumes.map(_.asJava).orNull)
      .executionRoleArn(executionRoleArn.orNull)
      .environment(environment.map(_.asJava).orNull)
      .privileged(privileged.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .logConfiguration(logConfiguration.orNull)
      .jobRoleArn(jobRoleArn.orNull)
      .fargatePlatformConfiguration(fargatePlatformConfiguration.orNull)
      .user(user.orNull)
      .build()
}
