package io.burkard.cdk.services.cloudwatch

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MetricConfig {

  def apply(
    renderingProperties: Option[Map[String, _]] = None,
    metricStat: Option[software.amazon.awscdk.services.cloudwatch.MetricStatConfig] = None,
    mathExpression: Option[software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig] = None
  ): software.amazon.awscdk.services.cloudwatch.MetricConfig =
    (new software.amazon.awscdk.services.cloudwatch.MetricConfig.Builder)
      .renderingProperties(renderingProperties.map(_.asJava).orNull)
      .metricStat(metricStat.orNull)
      .mathExpression(mathExpression.orNull)
      .build()
}
