package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CloudWatchAlarmDefinitionProperty {

  def apply(
    metricName: String,
    comparisonOperator: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator,
    period: software.amazon.awscdk.Duration,
    statistic: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic] = None,
    threshold: Option[Number] = None,
    dimensions: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.MetricDimensionProperty]] = None,
    unit: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit] = None,
    evaluationPeriods: Option[Number] = None,
    namespace: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmDefinitionProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmDefinitionProperty.Builder)
      .metricName(metricName)
      .comparisonOperator(comparisonOperator)
      .period(period)
      .statistic(statistic.orNull)
      .threshold(threshold.orNull)
      .dimensions(dimensions.map(_.asJava).orNull)
      .unit(unit.orNull)
      .evaluationPeriods(evaluationPeriods.orNull)
      .namespace(namespace.orNull)
      .build()
}
