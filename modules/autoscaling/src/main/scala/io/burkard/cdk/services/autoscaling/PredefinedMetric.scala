package io.burkard.cdk.services.autoscaling


sealed abstract class PredefinedMetric(val underlying: software.amazon.awscdk.services.autoscaling.PredefinedMetric)
  extends Product
    with Serializable


object PredefinedMetric {
  implicit def toAws(value: PredefinedMetric): software.amazon.awscdk.services.autoscaling.PredefinedMetric =
    Option(value).map(_.underlying).orNull

  case object AsgAverageCpuUtilization
    extends PredefinedMetric(software.amazon.awscdk.services.autoscaling.PredefinedMetric.ASG_AVERAGE_CPU_UTILIZATION)

  case object AsgAverageNetworkIn
    extends PredefinedMetric(software.amazon.awscdk.services.autoscaling.PredefinedMetric.ASG_AVERAGE_NETWORK_IN)

  case object AsgAverageNetworkOut
    extends PredefinedMetric(software.amazon.awscdk.services.autoscaling.PredefinedMetric.ASG_AVERAGE_NETWORK_OUT)

  case object AlbRequestCountPerTarget
    extends PredefinedMetric(software.amazon.awscdk.services.autoscaling.PredefinedMetric.ALB_REQUEST_COUNT_PER_TARGET)
}
