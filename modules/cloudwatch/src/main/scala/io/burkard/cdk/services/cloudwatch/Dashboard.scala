package io.burkard.cdk.services.cloudwatch

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Dashboard {

  def apply(
    internalResourceId: String,
    periodOverride: Option[software.amazon.awscdk.services.cloudwatch.PeriodOverride] = None,
    dashboardName: Option[String] = None,
    end: Option[String] = None,
    widgets: Option[List[_ <: List[_ <: software.amazon.awscdk.services.cloudwatch.IWidget]]] = None,
    start: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudwatch.Dashboard =
    software.amazon.awscdk.services.cloudwatch.Dashboard.Builder
      .create(stackCtx, internalResourceId)
      .periodOverride(periodOverride.orNull)
      .dashboardName(dashboardName.orNull)
      .end(end.orNull)
      .widgets(widgets.map(_.map(_.asJava).asJava).orNull)
      .start(start.orNull)
      .build()
}
