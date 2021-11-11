package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricGraphConfig {

  def apply(
    statistic: Option[String] = None,
    label: Option[String] = None,
    color: Option[String] = None,
    dimensions: Option[List[_ <: software.amazon.awscdk.services.cloudwatch.Dimension]] = None,
    unit: Option[software.amazon.awscdk.services.cloudwatch.Unit] = None,
    period: Option[Number] = None,
    namespace: Option[String] = None,
    metricName: Option[String] = None,
    renderingProperties: Option[software.amazon.awscdk.services.cloudwatch.MetricRenderingProperties] = None
  ): software.amazon.awscdk.services.cloudwatch.MetricGraphConfig =
    (new software.amazon.awscdk.services.cloudwatch.MetricGraphConfig.Builder)
      .statistic(statistic.orNull)
      .label(label.orNull)
      .color(color.orNull)
      .dimensions(dimensions.map(_.asJava).orNull)
      .unit(unit.orNull)
      .period(period.orNull)
      .namespace(namespace.orNull)
      .metricName(metricName.orNull)
      .renderingProperties(renderingProperties.orNull)
      .build()
}
