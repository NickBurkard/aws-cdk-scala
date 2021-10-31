package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CloudWatchAlarmDefinitionProperty {

  def apply(
    statistic: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmStatistic] = None,
    metricName: Option[String] = None,
    comparisonOperator: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmComparisonOperator] = None,
    threshold: Option[Number] = None,
    dimensions: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.MetricDimensionProperty]] = None,
    unit: Option[software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmUnit] = None,
    evaluationPeriods: Option[Number] = None,
    period: Option[software.amazon.awscdk.Duration] = None,
    namespace: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmDefinitionProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster.CloudWatchAlarmDefinitionProperty.Builder)
      .statistic(statistic.orNull)
      .metricName(metricName.orNull)
      .comparisonOperator(comparisonOperator.orNull)
      .threshold(threshold.orNull)
      .dimensions(dimensions.map(_.asJava).orNull)
      .unit(unit.orNull)
      .evaluationPeriods(evaluationPeriods.orNull)
      .period(period.orNull)
      .namespace(namespace.orNull)
      .build()
}
