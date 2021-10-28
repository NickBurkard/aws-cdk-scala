package io.burkard.cdk.services.cloudfront

sealed abstract class PriceClass(val underlying: software.amazon.awscdk.services.cloudfront.PriceClass)
  extends Product
    with Serializable

object PriceClass {
  implicit def toAws(value: PriceClass): software.amazon.awscdk.services.cloudfront.PriceClass =
    Option(value).map(_.underlying).orNull

  case object PriceClass100
    extends PriceClass(software.amazon.awscdk.services.cloudfront.PriceClass.PRICE_CLASS_100)

  case object PriceClass200
    extends PriceClass(software.amazon.awscdk.services.cloudfront.PriceClass.PRICE_CLASS_200)

  case object PriceClassAll
    extends PriceClass(software.amazon.awscdk.services.cloudfront.PriceClass.PRICE_CLASS_ALL)
}
