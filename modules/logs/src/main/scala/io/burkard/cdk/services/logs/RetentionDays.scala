package io.burkard.cdk.services.logs

sealed abstract class RetentionDays(val underlying: software.amazon.awscdk.services.logs.RetentionDays)
  extends Product
    with Serializable

object RetentionDays {
  implicit def toAws(value: RetentionDays): software.amazon.awscdk.services.logs.RetentionDays =
    Option(value).map(_.underlying).orNull

  case object EighteenMonths
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.EIGHTEEN_MONTHS)

  case object FiveDays
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.FIVE_DAYS)

  case object FiveMonths
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.FIVE_MONTHS)

  case object FiveYears
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.FIVE_YEARS)

  case object FourMonths
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.FOUR_MONTHS)

  case object Infinite
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.INFINITE)

  case object OneDay
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.ONE_DAY)

  case object OneMonth
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.ONE_MONTH)

  case object OneWeek
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.ONE_WEEK)

  case object OneYear
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.ONE_YEAR)

  case object SixMonths
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.SIX_MONTHS)

  case object TenYears
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.TEN_YEARS)

  case object ThirteenMonths
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.THIRTEEN_MONTHS)

  case object ThreeDays
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.THREE_DAYS)

  case object ThreeMonths
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.THREE_MONTHS)

  case object TwoMonths
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.TWO_MONTHS)

  case object TwoWeeks
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.TWO_WEEKS)

  case object TwoYears
    extends RetentionDays(software.amazon.awscdk.services.logs.RetentionDays.TWO_YEARS)
}
