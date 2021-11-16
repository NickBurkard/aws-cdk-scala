package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MetricExpressionConfig {

  def apply(
    expression: String,
    period: Number,
    usingMetrics: Map[String, _ <: software.amazon.awscdk.services.cloudwatch.IMetric],
    searchRegion: Option[String] = None,
    searchAccount: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig =
    (new software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig.Builder)
      .expression(expression)
      .period(period)
      .usingMetrics(usingMetrics.asJava)
      .searchRegion(searchRegion.orNull)
      .searchAccount(searchAccount.orNull)
      .build()
}
