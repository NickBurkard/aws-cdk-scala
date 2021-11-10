package io.burkard.cdk.services.config


sealed abstract class MaximumExecutionFrequency(val underlying: software.amazon.awscdk.services.config.MaximumExecutionFrequency)
  extends Product
    with Serializable


object MaximumExecutionFrequency {
  implicit def toAws(value: MaximumExecutionFrequency): software.amazon.awscdk.services.config.MaximumExecutionFrequency =
    Option(value).map(_.underlying).orNull

  case object OneHour
    extends MaximumExecutionFrequency(software.amazon.awscdk.services.config.MaximumExecutionFrequency.ONE_HOUR)

  case object ThreeHours
    extends MaximumExecutionFrequency(software.amazon.awscdk.services.config.MaximumExecutionFrequency.THREE_HOURS)

  case object SixHours
    extends MaximumExecutionFrequency(software.amazon.awscdk.services.config.MaximumExecutionFrequency.SIX_HOURS)

  case object TwelveHours
    extends MaximumExecutionFrequency(software.amazon.awscdk.services.config.MaximumExecutionFrequency.TWELVE_HOURS)

  case object TwentyFourHours
    extends MaximumExecutionFrequency(software.amazon.awscdk.services.config.MaximumExecutionFrequency.TWENTY_FOUR_HOURS)
}
