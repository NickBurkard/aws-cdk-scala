package io.burkard.cdk.services.logs

sealed abstract class RetentionDays(val underlying: software.amazon.awscdk.services.logs.RetentionDays)
  extends Product
    with Serializable

object RetentionDays {
  implicit def toAws(value: RetentionDays): software.amazon.awscdk.services.logs.RetentionDays =
    Option(value).map(_.underlying).orNull

  case object OneDay
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.ONE_DAY)

  case object ThreeDays
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.THREE_DAYS)

  case object FiveDays
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.FIVE_DAYS)

  case object OneWeek
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.ONE_WEEK)

  case object TwoWeeks
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.TWO_WEEKS)

  case object OneMonth
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.ONE_MONTH)

  case object TwoMonths
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.TWO_MONTHS)

  case object ThreeMonths
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.THREE_MONTHS)

  case object FourMonths
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.FOUR_MONTHS)

  case object FiveMonths
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.FIVE_MONTHS)

  case object SixMonths
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.SIX_MONTHS)

  case object OneYear
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.ONE_YEAR)

  case object ThirteenMonths
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.THIRTEEN_MONTHS)

  case object EighteenMonths
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.EIGHTEEN_MONTHS)

  case object TwoYears
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.TWO_YEARS)

  case object FiveYears
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.FIVE_YEARS)

  case object TenYears
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.TEN_YEARS)

  case object Infinite
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.INFINITE)
}
