package io.burkard.cdk.services.ecs

sealed abstract class Scope(val underlying: software.amazon.awscdk.services.ecs.Scope)
  extends Product
    with Serializable

object Scope {
  implicit def toAws(value: Scope): software.amazon.awscdk.services.ecs.Scope =
    Option(value).map(_.underlying).orNull

  case object Task
    extends Scope(software.amazon.awscdk.services.ecs.Scope.TASK)

  case object Shared
    extends Scope(software.amazon.awscdk.services.ecs.Scope.SHARED)
}
