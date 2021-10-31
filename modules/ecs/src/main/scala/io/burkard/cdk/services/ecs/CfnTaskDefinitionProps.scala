package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTaskDefinitionProps {

  def apply(
    pidMode: Option[String] = None,
    inferenceAccelerators: Option[List[_]] = None,
    volumes: Option[List[_]] = None,
    ephemeralStorage: Option[software.amazon.awscdk.services.ecs.CfnTaskDefinition.EphemeralStorageProperty] = None,
    ipcMode: Option[String] = None,
    containerDefinitions: Option[List[_]] = None,
    networkMode: Option[String] = None,
    placementConstraints: Option[List[_]] = None,
    family: Option[String] = None,
    memory: Option[String] = None,
    taskRoleArn: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    requiresCompatibilities: Option[List[String]] = None,
    proxyConfiguration: Option[software.amazon.awscdk.services.ecs.CfnTaskDefinition.ProxyConfigurationProperty] = None,
    cpu: Option[String] = None,
    executionRoleArn: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinitionProps.Builder)
      .pidMode(pidMode.orNull)
      .inferenceAccelerators(inferenceAccelerators.map(_.asJava).orNull)
      .volumes(volumes.map(_.asJava).orNull)
      .ephemeralStorage(ephemeralStorage.orNull)
      .ipcMode(ipcMode.orNull)
      .containerDefinitions(containerDefinitions.map(_.asJava).orNull)
      .networkMode(networkMode.orNull)
      .placementConstraints(placementConstraints.map(_.asJava).orNull)
      .family(family.orNull)
      .memory(memory.orNull)
      .taskRoleArn(taskRoleArn.orNull)
      .tags(tags.map(_.asJava).orNull)
      .requiresCompatibilities(requiresCompatibilities.map(_.asJava).orNull)
      .proxyConfiguration(proxyConfiguration.orNull)
      .cpu(cpu.orNull)
      .executionRoleArn(executionRoleArn.orNull)
      .build()
}
