package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
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
