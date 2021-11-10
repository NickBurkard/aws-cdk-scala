package io.burkard.cdk.services.emr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
  ): software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.Builder)
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
