package io.burkard.cdk.services.cloudwatch

sealed abstract class GraphWidgetView(val underlying: software.amazon.awscdk.services.cloudwatch.GraphWidgetView)
  extends Product
    with Serializable

object GraphWidgetView {
  implicit def toAws(value: GraphWidgetView): software.amazon.awscdk.services.cloudwatch.GraphWidgetView =
    Option(value).map(_.underlying).orNull

  case object TimeSeries
    extends GraphWidgetView(software.amazon.awscdk.services.cloudwatch.GraphWidgetView.TIME_SERIES)

  case object Bar
    extends GraphWidgetView(software.amazon.awscdk.services.cloudwatch.GraphWidgetView.BAR)

  case object Pie
    extends GraphWidgetView(software.amazon.awscdk.services.cloudwatch.GraphWidgetView.PIE)
}
