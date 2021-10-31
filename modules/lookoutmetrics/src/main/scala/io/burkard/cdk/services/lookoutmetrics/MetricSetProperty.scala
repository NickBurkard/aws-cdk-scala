package io.burkard.cdk.services.lookoutmetrics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MetricSetProperty {

  def apply(
    metricSetDescription: Option[String] = None,
    dimensionList: Option[List[String]] = None,
    metricSource: Option[software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSourceProperty] = None,
    metricSetName: Option[String] = None,
    offset: Option[Number] = None,
    timestampColumn: Option[software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.TimestampColumnProperty] = None,
    metricList: Option[List[_]] = None,
    metricSetFrequency: Option[String] = None,
    timezone: Option[String] = None
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSetProperty =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.MetricSetProperty.Builder)
      .metricSetDescription(metricSetDescription.orNull)
      .dimensionList(dimensionList.map(_.asJava).orNull)
      .metricSource(metricSource.orNull)
      .metricSetName(metricSetName.orNull)
      .offset(offset.orNull)
      .timestampColumn(timestampColumn.orNull)
      .metricList(metricList.map(_.asJava).orNull)
      .metricSetFrequency(metricSetFrequency.orNull)
      .timezone(timezone.orNull)
      .build()
}
