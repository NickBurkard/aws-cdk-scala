package io.burkard.cdk.services.ecs

sealed abstract class DeploymentControllerType(val underlying: software.amazon.awscdk.services.ecs.DeploymentControllerType)
  extends Product
    with Serializable

object DeploymentControllerType {
  implicit def toAws(value: DeploymentControllerType): software.amazon.awscdk.services.ecs.DeploymentControllerType =
    Option(value).map(_.underlying).orNull

  case object CodeDeploy
    extends DeploymentControllerType(software.amazon.awscdk.services.ecs.DeploymentControllerType.CODE_DEPLOY)

  case object Ecs
    extends DeploymentControllerType(software.amazon.awscdk.services.ecs.DeploymentControllerType.ECS)

  case object External
    extends DeploymentControllerType(software.amazon.awscdk.services.ecs.DeploymentControllerType.EXTERNAL)
}
