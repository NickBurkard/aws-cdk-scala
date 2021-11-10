package io.burkard.cdk.services.apigateway


sealed abstract class Period(val underlying: software.amazon.awscdk.services.apigateway.Period)
  extends Product
    with Serializable


object Period {
  implicit def toAws(value: Period): software.amazon.awscdk.services.apigateway.Period =
    Option(value).map(_.underlying).orNull

  case object Day
    extends Period(software.amazon.awscdk.services.apigateway.Period.DAY)

  case object Week
    extends Period(software.amazon.awscdk.services.apigateway.Period.WEEK)

  case object Month
    extends Period(software.amazon.awscdk.services.apigateway.Period.MONTH)
}
