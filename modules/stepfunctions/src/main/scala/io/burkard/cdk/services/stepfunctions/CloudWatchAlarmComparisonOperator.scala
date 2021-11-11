package io.burkard.cdk.services.stepfunctions

sealed abstract class CloudWatchAlarmComparisonOperator(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator)
  extends Product
    with Serializable

object CloudWatchAlarmComparisonOperator {
  implicit def toAws(value: CloudWatchAlarmComparisonOperator): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator =
    Option(value).map(_.underlying).orNull

  case object GreaterThanOrEqual
    extends CloudWatchAlarmComparisonOperator(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator.GREATER_THAN_OR_EQUAL)

  case object GreaterThan
    extends CloudWatchAlarmComparisonOperator(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator.GREATER_THAN)

  case object LessThan
    extends CloudWatchAlarmComparisonOperator(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator.LESS_THAN)

  case object LessThanOrEqual
    extends CloudWatchAlarmComparisonOperator(software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator.LESS_THAN_OR_EQUAL)
}
