package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MetricExpressionConfig {

  def apply(
    searchRegion: Option[String] = None,
    expression: Option[String] = None,
    period: Option[Number] = None,
    searchAccount: Option[String] = None,
    usingMetrics: Option[Map[String, _ <: software.amazon.awscdk.services.cloudwatch.IMetric]] = None
  ): software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig =
    (new software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig.Builder)
      .searchRegion(searchRegion.orNull)
      .expression(expression.orNull)
      .period(period.orNull)
      .searchAccount(searchAccount.orNull)
      .usingMetrics(usingMetrics.map(_.asJava).orNull)
      .build()
}
