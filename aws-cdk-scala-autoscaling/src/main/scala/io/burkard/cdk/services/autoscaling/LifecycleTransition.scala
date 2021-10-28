package io.burkard.cdk.services.autoscaling

sealed abstract class LifecycleTransition(val underlying: software.amazon.awscdk.services.autoscaling.LifecycleTransition)
  extends Product
    with Serializable

object LifecycleTransition {
  implicit def toAws(value: LifecycleTransition): software.amazon.awscdk.services.autoscaling.LifecycleTransition =
    Option(value).map(_.underlying).orNull

  case object InstanceLaunching
    extends LifecycleTransition(software.amazon.awscdk.services.autoscaling.LifecycleTransition.INSTANCE_LAUNCHING)

  case object InstanceTerminating
    extends LifecycleTransition(software.amazon.awscdk.services.autoscaling.LifecycleTransition.INSTANCE_TERMINATING)
}
