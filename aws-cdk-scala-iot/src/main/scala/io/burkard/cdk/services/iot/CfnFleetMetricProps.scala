package io.burkard.cdk.services.iot

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFleetMetricProps {

  def apply(
    metricName: Option[String] = None,
    queryString: Option[String] = None,
    aggregationField: Option[String] = None,
    indexName: Option[String] = None,
    aggregationType: Option[software.amazon.awscdk.services.iot.CfnFleetMetric.AggregationTypeProperty] = None,
    unit: Option[String] = None,
    queryVersion: Option[String] = None,
    period: Option[Number] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.iot.CfnFleetMetricProps =
    (new software.amazon.awscdk.services.iot.CfnFleetMetricProps.Builder)
      .metricName(metricName.orNull)
      .queryString(queryString.orNull)
      .aggregationField(aggregationField.orNull)
      .indexName(indexName.orNull)
      .aggregationType(aggregationType.orNull)
      .unit(unit.orNull)
      .queryVersion(queryVersion.orNull)
      .period(period.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
