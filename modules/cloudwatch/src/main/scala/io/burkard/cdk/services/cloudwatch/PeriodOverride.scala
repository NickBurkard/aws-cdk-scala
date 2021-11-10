package io.burkard.cdk.services.cloudwatch


sealed abstract class PeriodOverride(val underlying: software.amazon.awscdk.services.cloudwatch.PeriodOverride)
  extends Product
    with Serializable


object PeriodOverride {
  implicit def toAws(value: PeriodOverride): software.amazon.awscdk.services.cloudwatch.PeriodOverride =
    Option(value).map(_.underlying).orNull

  case object Auto
    extends PeriodOverride(software.amazon.awscdk.services.cloudwatch.PeriodOverride.AUTO)

  case object Inherit
    extends PeriodOverride(software.amazon.awscdk.services.cloudwatch.PeriodOverride.INHERIT)
}
