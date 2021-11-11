package io.burkard.cdk.services.ecs

sealed abstract class PropagatedTagSource(val underlying: software.amazon.awscdk.services.ecs.PropagatedTagSource)
  extends Product
    with Serializable

object PropagatedTagSource {
  implicit def toAws(value: PropagatedTagSource): software.amazon.awscdk.services.ecs.PropagatedTagSource =
    Option(value).map(_.underlying).orNull

  case object Service
    extends PropagatedTagSource(software.amazon.awscdk.services.ecs.PropagatedTagSource.SERVICE)

  case object TaskDefinition
    extends PropagatedTagSource(software.amazon.awscdk.services.ecs.PropagatedTagSource.TASK_DEFINITION)

  case object None
    extends PropagatedTagSource(software.amazon.awscdk.services.ecs.PropagatedTagSource.NONE)
}
