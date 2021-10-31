package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SingleValueWidget {

  def apply(
    height: Option[Number] = None,
    fullPrecision: Option[Boolean] = None,
    region: Option[String] = None,
    metrics: Option[List[_ <: software.amazon.awscdk.services.cloudwatch.IMetric]] = None,
    title: Option[String] = None,
    setPeriodToTimeRange: Option[Boolean] = None,
    width: Option[Number] = None
  ): software.amazon.awscdk.services.cloudwatch.SingleValueWidget =
    software.amazon.awscdk.services.cloudwatch.SingleValueWidget.Builder
      .create()
      .height(height.orNull)
      .fullPrecision(fullPrecision.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .region(region.orNull)
      .metrics(metrics.map(_.asJava).orNull)
      .title(title.orNull)
      .setPeriodToTimeRange(setPeriodToTimeRange.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .width(width.orNull)
      .build()
}
