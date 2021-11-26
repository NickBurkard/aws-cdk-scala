package io.burkard.cdk.services.fsx

sealed abstract class Weekday(val underlying: software.amazon.awscdk.services.fsx.Weekday)
  extends Product
    with Serializable

object Weekday {
  implicit def toAws(value: Weekday): software.amazon.awscdk.services.fsx.Weekday =
    Option(value).map(_.underlying).orNull

  case object Friday
    extends Weekday(software.amazon.awscdk.services.fsx.Weekday.FRIDAY)

  case object Monday
    extends Weekday(software.amazon.awscdk.services.fsx.Weekday.MONDAY)

  case object Saturday
    extends Weekday(software.amazon.awscdk.services.fsx.Weekday.SATURDAY)

  case object Sunday
    extends Weekday(software.amazon.awscdk.services.fsx.Weekday.SUNDAY)

  case object Thursday
    extends Weekday(software.amazon.awscdk.services.fsx.Weekday.THURSDAY)

  case object Tuesday
    extends Weekday(software.amazon.awscdk.services.fsx.Weekday.TUESDAY)

  case object Wednesday
    extends Weekday(software.amazon.awscdk.services.fsx.Weekday.WEDNESDAY)
}
