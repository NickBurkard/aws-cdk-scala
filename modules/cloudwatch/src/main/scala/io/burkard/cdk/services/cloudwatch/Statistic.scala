package io.burkard.cdk.services.cloudwatch

sealed abstract class Statistic(val underlying: software.amazon.awscdk.services.cloudwatch.Statistic)
  extends Product
    with Serializable

object Statistic {
  implicit def toAws(value: Statistic): software.amazon.awscdk.services.cloudwatch.Statistic =
    Option(value).map(_.underlying).orNull

  case object Average
    extends Statistic(software.amazon.awscdk.services.cloudwatch.Statistic.AVERAGE)

  case object Maximum
    extends Statistic(software.amazon.awscdk.services.cloudwatch.Statistic.MAXIMUM)

  case object Minimum
    extends Statistic(software.amazon.awscdk.services.cloudwatch.Statistic.MINIMUM)

  case object SampleCount
    extends Statistic(software.amazon.awscdk.services.cloudwatch.Statistic.SAMPLE_COUNT)

  case object Sum
    extends Statistic(software.amazon.awscdk.services.cloudwatch.Statistic.SUM)
}
