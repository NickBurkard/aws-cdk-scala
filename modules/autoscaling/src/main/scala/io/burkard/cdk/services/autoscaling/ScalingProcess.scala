package io.burkard.cdk.services.autoscaling

sealed abstract class ScalingProcess(val underlying: software.amazon.awscdk.services.autoscaling.ScalingProcess)
  extends Product
    with Serializable

object ScalingProcess {
  implicit def toAws(value: ScalingProcess): software.amazon.awscdk.services.autoscaling.ScalingProcess =
    Option(value).map(_.underlying).orNull

  case object Launch
    extends ScalingProcess(software.amazon.awscdk.services.autoscaling.ScalingProcess.LAUNCH)

  case object Terminate
    extends ScalingProcess(software.amazon.awscdk.services.autoscaling.ScalingProcess.TERMINATE)

  case object HealthCheck
    extends ScalingProcess(software.amazon.awscdk.services.autoscaling.ScalingProcess.HEALTH_CHECK)

  case object ReplaceUnhealthy
    extends ScalingProcess(software.amazon.awscdk.services.autoscaling.ScalingProcess.REPLACE_UNHEALTHY)

  case object AzRebalance
    extends ScalingProcess(software.amazon.awscdk.services.autoscaling.ScalingProcess.AZ_REBALANCE)

  case object AlarmNotification
    extends ScalingProcess(software.amazon.awscdk.services.autoscaling.ScalingProcess.ALARM_NOTIFICATION)

  case object ScheduledActions
    extends ScalingProcess(software.amazon.awscdk.services.autoscaling.ScalingProcess.SCHEDULED_ACTIONS)

  case object AddToLoadBalancer
    extends ScalingProcess(software.amazon.awscdk.services.autoscaling.ScalingProcess.ADD_TO_LOAD_BALANCER)
}
