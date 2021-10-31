package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MathExpression {

  def apply(
    searchRegion: Option[String] = None,
    label: Option[String] = None,
    color: Option[String] = None,
    expression: Option[String] = None,
    period: Option[software.amazon.awscdk.Duration] = None,
    searchAccount: Option[String] = None,
    usingMetrics: Option[Map[String, _ <: software.amazon.awscdk.services.cloudwatch.IMetric]] = None
  ): software.amazon.awscdk.services.cloudwatch.MathExpression =
    software.amazon.awscdk.services.cloudwatch.MathExpression.Builder
      .create()
      .searchRegion(searchRegion.orNull)
      .label(label.orNull)
      .color(color.orNull)
      .expression(expression.orNull)
      .period(period.orNull)
      .searchAccount(searchAccount.orNull)
      .usingMetrics(usingMetrics.map(_.asJava).orNull)
      .build()
}
