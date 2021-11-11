package io.burkard.cdk.services.rds

sealed abstract class PerformanceInsightRetention(val underlying: software.amazon.awscdk.services.rds.PerformanceInsightRetention)
  extends Product
    with Serializable

object PerformanceInsightRetention {
  implicit def toAws(value: PerformanceInsightRetention): software.amazon.awscdk.services.rds.PerformanceInsightRetention =
    Option(value).map(_.underlying).orNull

  case object Default
    extends PerformanceInsightRetention(software.amazon.awscdk.services.rds.PerformanceInsightRetention.DEFAULT)

  case object LongTerm
    extends PerformanceInsightRetention(software.amazon.awscdk.services.rds.PerformanceInsightRetention.LONG_TERM)
}
