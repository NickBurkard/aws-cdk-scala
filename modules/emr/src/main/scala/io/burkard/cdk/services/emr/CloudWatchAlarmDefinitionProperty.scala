package io.burkard.cdk.services.emr

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CloudWatchAlarmDefinitionProperty {

  def apply(
    statistic: Option[String] = None,
    metricName: Option[String] = None,
    comparisonOperator: Option[String] = None,
    threshold: Option[Number] = None,
    dimensions: Option[List[_]] = None,
    unit: Option[String] = None,
    evaluationPeriods: Option[Number] = None,
    period: Option[Number] = None,
    namespace: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty =
    (new software.amazon.awscdk.services.emr.CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder)
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
