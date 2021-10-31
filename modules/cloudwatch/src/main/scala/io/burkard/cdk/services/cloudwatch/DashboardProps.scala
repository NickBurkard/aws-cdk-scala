package io.burkard.cdk.services.cloudwatch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DashboardProps {

  def apply(
    periodOverride: Option[software.amazon.awscdk.services.cloudwatch.PeriodOverride] = None,
    dashboardName: Option[String] = None,
    end: Option[String] = None,
    widgets: Option[List[_ <: List[_ <: software.amazon.awscdk.services.cloudwatch.IWidget]]] = None,
    start: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.DashboardProps =
    (new software.amazon.awscdk.services.cloudwatch.DashboardProps.Builder)
      .periodOverride(periodOverride.orNull)
      .dashboardName(dashboardName.orNull)
      .end(end.orNull)
      .widgets(widgets.map(_.map(_.asJava).asJava).orNull)
      .start(start.orNull)
      .build()
}
