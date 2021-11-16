package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MathExpressionProps {

  def apply(
    expression: String,
    searchRegion: Option[String] = None,
    label: Option[String] = None,
    color: Option[String] = None,
    period: Option[software.amazon.awscdk.Duration] = None,
    searchAccount: Option[String] = None,
    usingMetrics: Option[Map[String, _ <: software.amazon.awscdk.services.cloudwatch.IMetric]] = None
  ): software.amazon.awscdk.services.cloudwatch.MathExpressionProps =
    (new software.amazon.awscdk.services.cloudwatch.MathExpressionProps.Builder)
      .expression(expression)
      .searchRegion(searchRegion.orNull)
      .label(label.orNull)
      .color(color.orNull)
      .period(period.orNull)
      .searchAccount(searchAccount.orNull)
      .usingMetrics(usingMetrics.map(_.asJava).orNull)
      .build()
}
