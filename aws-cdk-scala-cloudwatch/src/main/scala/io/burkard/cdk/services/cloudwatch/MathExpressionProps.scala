package io.burkard.cdk.services.cloudwatch

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MathExpressionProps {

  def apply(
    searchRegion: Option[String] = None,
    label: Option[String] = None,
    color: Option[String] = None,
    expression: Option[String] = None,
    period: Option[software.amazon.awscdk.Duration] = None,
    searchAccount: Option[String] = None,
    usingMetrics: Option[Map[String, _ <: software.amazon.awscdk.services.cloudwatch.IMetric]] = None
  ): software.amazon.awscdk.services.cloudwatch.MathExpressionProps =
    (new software.amazon.awscdk.services.cloudwatch.MathExpressionProps.Builder)
      .searchRegion(searchRegion.orNull)
      .label(label.orNull)
      .color(color.orNull)
      .expression(expression.orNull)
      .period(period.orNull)
      .searchAccount(searchAccount.orNull)
      .usingMetrics(usingMetrics.map(_.asJava).orNull)
      .build()
}
