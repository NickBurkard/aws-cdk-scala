package io.burkard.cdk.services.cloudwatch

sealed abstract class LogQueryVisualizationType(val underlying: software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType)
  extends Product
    with Serializable

object LogQueryVisualizationType {
  implicit def toAws(value: LogQueryVisualizationType): software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType =
    Option(value).map(_.underlying).orNull

  case object Table
    extends LogQueryVisualizationType(software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType.TABLE)

  case object Line
    extends LogQueryVisualizationType(software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType.LINE)

  case object Stackedarea
    extends LogQueryVisualizationType(software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType.STACKEDAREA)

  case object Bar
    extends LogQueryVisualizationType(software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType.BAR)

  case object Pie
    extends LogQueryVisualizationType(software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType.PIE)
}
