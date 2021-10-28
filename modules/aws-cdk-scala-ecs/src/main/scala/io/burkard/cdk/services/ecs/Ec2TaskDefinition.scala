package io.burkard.cdk.services.ecs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Ec2TaskDefinition {

  def apply(
    internalResourceId: String,
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
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecs.Ec2TaskDefinition =
    software.amazon.awscdk.services.ecs.Ec2TaskDefinition.Builder
      .create(stackCtx, internalResourceId)
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
