package io.burkard.cdk.services.emr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CloudWatchAlarmDefinitionProperty {

  def apply(
    metricName: String,
    comparisonOperator: String,
    threshold: Number,
    period: Number,
    statistic: Option[String] = None,
    dimensions: Option[List[_]] = None,
    unit: Option[String] = None,
    evaluationPeriods: Option[Number] = None,
    namespace: Option[String] = None
  ): software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty =
    (new software.amazon.awscdk.services.emr.CfnCluster.CloudWatchAlarmDefinitionProperty.Builder)
      .metricName(metricName)
      .comparisonOperator(comparisonOperator)
      .threshold(threshold)
      .period(period)
      .statistic(statistic.orNull)
      .dimensions(dimensions.map(_.asJava).orNull)
      .unit(unit.orNull)
      .evaluationPeriods(evaluationPeriods.orNull)
      .namespace(namespace.orNull)
      .build()
}
