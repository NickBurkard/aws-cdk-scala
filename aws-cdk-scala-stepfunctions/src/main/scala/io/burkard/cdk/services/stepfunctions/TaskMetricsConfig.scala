package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TaskMetricsConfig {

  def apply(
    metricDimensions: Option[Map[String, _]] = None,
    metricPrefixPlural: Option[String] = None,
    metricPrefixSingular: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.TaskMetricsConfig =
    (new software.amazon.awscdk.services.stepfunctions.TaskMetricsConfig.Builder)
      .metricDimensions(metricDimensions.map(_.asJava).orNull)
      .metricPrefixPlural(metricPrefixPlural.orNull)
      .metricPrefixSingular(metricPrefixSingular.orNull)
      .build()
}
