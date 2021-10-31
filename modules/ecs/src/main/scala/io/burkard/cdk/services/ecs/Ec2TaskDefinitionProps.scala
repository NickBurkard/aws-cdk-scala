package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Ec2TaskDefinitionProps {

  def apply(
    pidMode: Option[software.amazon.awscdk.services.ecs.PidMode] = None,
    ipcMode: Option[software.amazon.awscdk.services.ecs.IpcMode] = None,
    proxyConfiguration: Option[software.amazon.awscdk.services.ecs.ProxyConfiguration] = None,
    networkMode: Option[software.amazon.awscdk.services.ecs.NetworkMode] = None,
    placementConstraints: Option[List[_ <: software.amazon.awscdk.services.ecs.PlacementConstraint]] = None,
    family: Option[String] = None,
    inferenceAccelerators: Option[List[_ <: software.amazon.awscdk.services.ecs.InferenceAccelerator]] = None,
    executionRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    volumes: Option[List[_ <: software.amazon.awscdk.services.ecs.Volume]] = None,
    taskRole: Option[software.amazon.awscdk.services.iam.IRole] = None
  ): software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps =
    (new software.amazon.awscdk.services.ecs.Ec2TaskDefinitionProps.Builder)
      .pidMode(pidMode.orNull)
      .ipcMode(ipcMode.orNull)
      .proxyConfiguration(proxyConfiguration.orNull)
      .networkMode(networkMode.orNull)
      .placementConstraints(placementConstraints.map(_.asJava).orNull)
      .family(family.orNull)
      .inferenceAccelerators(inferenceAccelerators.map(_.asJava).orNull)
      .executionRole(executionRole.orNull)
      .volumes(volumes.map(_.asJava).orNull)
      .taskRole(taskRole.orNull)
      .build()
}
