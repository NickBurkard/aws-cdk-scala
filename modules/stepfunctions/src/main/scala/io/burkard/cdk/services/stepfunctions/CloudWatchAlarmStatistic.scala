package io.burkard.cdk.services.stepfunctions

sealed abstract class CloudWatchAlarmStatistic(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic)
  extends Product
    with Serializable

object CloudWatchAlarmStatistic {
  implicit def toAws(value: CloudWatchAlarmStatistic): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic =
    Option(value).map(_.underlying).orNull

  case object Average
    extends CloudWatchAlarmStatistic(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic.AVERAGE)

  case object Maximum
    extends CloudWatchAlarmStatistic(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic.MAXIMUM)

  case object Minimum
    extends CloudWatchAlarmStatistic(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic.MINIMUM)

  case object SampleCount
    extends CloudWatchAlarmStatistic(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic.SAMPLE_COUNT)

  case object Sum
    extends CloudWatchAlarmStatistic(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic.SUM)
}
