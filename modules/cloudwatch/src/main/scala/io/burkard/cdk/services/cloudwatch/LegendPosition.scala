package io.burkard.cdk.services.cloudwatch

sealed abstract class LegendPosition(val underlying: software.amazon.awscdk.services.cloudwatch.LegendPosition)
  extends Product
    with Serializable

object LegendPosition {
  implicit def toAws(value: LegendPosition): software.amazon.awscdk.services.cloudwatch.LegendPosition =
    Option(value).map(_.underlying).orNull

  case object Bottom
    extends LegendPosition(software.amazon.awscdk.services.cloudwatch.LegendPosition.BOTTOM)

  case object Right
    extends LegendPosition(software.amazon.awscdk.services.cloudwatch.LegendPosition.RIGHT)

  case object Hidden
    extends LegendPosition(software.amazon.awscdk.services.cloudwatch.LegendPosition.HIDDEN)
}
