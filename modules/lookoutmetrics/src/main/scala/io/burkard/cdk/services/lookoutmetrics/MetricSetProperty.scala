package io.burkard.cdk.services.lookoutmetrics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricSetProperty {

  def apply(
    metricSource: software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSourceProperty,
    metricSetName: String,
    metricList: List[_],
    metricSetDescription: Option[String] = None,
    dimensionList: Option[List[String]] = None,
    offset: Option[Number] = None,
    timestampColumn: Option[software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.TimestampColumnProperty] = None,
    metricSetFrequency: Option[String] = None,
    timezone: Option[String] = None
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSetProperty =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSetProperty.Builder)
      .metricSource(metricSource)
      .metricSetName(metricSetName)
      .metricList(metricList.asJava)
      .metricSetDescription(metricSetDescription.orNull)
      .dimensionList(dimensionList.map(_.asJava).orNull)
      .offset(offset.orNull)
      .timestampColumn(timestampColumn.orNull)
      .metricSetFrequency(metricSetFrequency.orNull)
      .timezone(timezone.orNull)
      .build()
}
