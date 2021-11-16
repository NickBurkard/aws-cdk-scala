package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TaskDefinitionProps {

  def apply(
    compatibility: software.amazon.awscdk.services.ecs.Compatibility,
    pidMode: Option[software.amazon.awscdk.services.ecs.PidMode] = None,
    memoryMiB: Option[String] = None,
    ipcMode: Option[software.amazon.awscdk.services.ecs.IpcMode] = None,
    proxyConfiguration: Option[software.amazon.awscdk.services.ecs.ProxyConfiguration] = None,
    cpu: Option[String] = None,
    placementConstraints: Option[List[_ <: software.amazon.awscdk.services.ecs.PlacementConstraint]] = None,
    family: Option[String] = None,
    inferenceAccelerators: Option[List[_ <: software.amazon.awscdk.services.ecs.InferenceAccelerator]] = None,
    executionRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    volumes: Option[List[_ <: software.amazon.awscdk.services.ecs.Volume]] = None,
    taskRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    networkMode: Option[software.amazon.awscdk.services.ecs.NetworkMode] = None,
    ephemeralStorageGiB: Option[Number] = None
  ): software.amazon.awscdk.services.ecs.TaskDefinitionProps =
    (new software.amazon.awscdk.services.ecs.TaskDefinitionProps.Builder)
      .compatibility(compatibility)
      .pidMode(pidMode.orNull)
      .memoryMiB(memoryMiB.orNull)
      .ipcMode(ipcMode.orNull)
      .proxyConfiguration(proxyConfiguration.orNull)
      .cpu(cpu.orNull)
      .placementConstraints(placementConstraints.map(_.asJava).orNull)
      .family(family.orNull)
      .inferenceAccelerators(inferenceAccelerators.map(_.asJava).orNull)
      .executionRole(executionRole.orNull)
      .volumes(volumes.map(_.asJava).orNull)
      .taskRole(taskRole.orNull)
      .networkMode(networkMode.orNull)
      .ephemeralStorageGiB(ephemeralStorageGiB.orNull)
      .build()
}
