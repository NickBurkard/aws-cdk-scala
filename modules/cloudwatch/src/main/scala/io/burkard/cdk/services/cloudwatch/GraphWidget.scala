package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GraphWidget {

  def apply(
    rightAnnotations: Option[List[_ <: software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation]] = None,
    leftAnnotations: Option[List[_ <: software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation]] = None,
    left: Option[List[_ <: software.amazon.awscdk.services.cloudwatch.IMetric]] = None,
    height: Option[Number] = None,
    rightYAxis: Option[software.amazon.awscdk.services.cloudwatch.YAxisProps] = None,
    region: Option[String] = None,
    title: Option[String] = None,
    width: Option[Number] = None,
    view: Option[software.amazon.awscdk.services.cloudwatch.GraphWidgetView] = None,
    stacked: Option[Boolean] = None,
    legendPosition: Option[software.amazon.awscdk.services.cloudwatch.LegendPosition] = None,
    statistic: Option[String] = None,
    liveData: Option[Boolean] = None,
    leftYAxis: Option[software.amazon.awscdk.services.cloudwatch.YAxisProps] = None,
    setPeriodToTimeRange: Option[Boolean] = None,
    period: Option[software.amazon.awscdk.Duration] = None,
    right: Option[List[_ <: software.amazon.awscdk.services.cloudwatch.IMetric]] = None
  ): software.amazon.awscdk.services.cloudwatch.GraphWidget =
    software.amazon.awscdk.services.cloudwatch.GraphWidget.Builder
      .create()
      .rightAnnotations(rightAnnotations.map(_.asJava).orNull)
      .leftAnnotations(leftAnnotations.map(_.asJava).orNull)
      .left(left.map(_.asJava).orNull)
      .height(height.orNull)
      .rightYAxis(rightYAxis.orNull)
      .region(region.orNull)
      .title(title.orNull)
      .width(width.orNull)
      .view(view.orNull)
      .stacked(stacked.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .legendPosition(legendPosition.orNull)
      .statistic(statistic.orNull)
      .liveData(liveData.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .leftYAxis(leftYAxis.orNull)
      .setPeriodToTimeRange(setPeriodToTimeRange.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .period(period.orNull)
      .right(right.map(_.asJava).orNull)
      .build()
}
