package io.burkard.cdk.services.ecs

sealed abstract class ContainerDependencyCondition(val underlying: software.amazon.awscdk.services.ecs.ContainerDependencyCondition)
  extends Product
    with Serializable

object ContainerDependencyCondition {
  implicit def toAws(value: ContainerDependencyCondition): software.amazon.awscdk.services.ecs.ContainerDependencyCondition =
    Option(value).map(_.underlying).orNull

  case object Complete
    extends ContainerDependencyCondition(software.amazon.awscdk.services.ecs.ContainerDependencyCondition.COMPLETE)

  case object Healthy
    extends ContainerDependencyCondition(software.amazon.awscdk.services.ecs.ContainerDependencyCondition.HEALTHY)

  case object Start
    extends ContainerDependencyCondition(software.amazon.awscdk.services.ecs.ContainerDependencyCondition.START)

  case object Success
    extends ContainerDependencyCondition(software.amazon.awscdk.services.ecs.ContainerDependencyCondition.SUCCESS)
}
