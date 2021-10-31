package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFleetMetric {

  def apply(
    internalResourceId: String,
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
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot.CfnFleetMetric =
    software.amazon.awscdk.services.iot.CfnFleetMetric.Builder
      .create(stackCtx, internalResourceId)
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
