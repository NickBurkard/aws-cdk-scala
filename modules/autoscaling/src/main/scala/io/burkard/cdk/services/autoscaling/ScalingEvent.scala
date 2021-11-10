package io.burkard.cdk.services.autoscaling


sealed abstract class ScalingEvent(val underlying: software.amazon.awscdk.services.autoscaling.ScalingEvent)
  extends Product
    with Serializable


object ScalingEvent {
  implicit def toAws(value: ScalingEvent): software.amazon.awscdk.services.autoscaling.ScalingEvent =
    Option(value).map(_.underlying).orNull

  case object InstanceLaunch
    extends ScalingEvent(software.amazon.awscdk.services.autoscaling.ScalingEvent.INSTANCE_LAUNCH)

  case object InstanceTerminate
    extends ScalingEvent(software.amazon.awscdk.services.autoscaling.ScalingEvent.INSTANCE_TERMINATE)

  case object InstanceTerminateError
    extends ScalingEvent(software.amazon.awscdk.services.autoscaling.ScalingEvent.INSTANCE_TERMINATE_ERROR)

  case object InstanceLaunchError
    extends ScalingEvent(software.amazon.awscdk.services.autoscaling.ScalingEvent.INSTANCE_LAUNCH_ERROR)

  case object TestNotification
    extends ScalingEvent(software.amazon.awscdk.services.autoscaling.ScalingEvent.TEST_NOTIFICATION)
}
