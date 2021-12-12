package io.burkard.cdk.services.cloudfront

sealed abstract class HeadersReferrerPolicy(val underlying: software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy)
  extends Product
    with Serializable

object HeadersReferrerPolicy {
  implicit def toAws(value: HeadersReferrerPolicy): software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy =
    Option(value).map(_.underlying).orNull

  case object NoReferrer
    extends HeadersReferrerPolicy(software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy.NO_REFERRER)

  case object NoReferrerWhenDowngrade
    extends HeadersReferrerPolicy(software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy.NO_REFERRER_WHEN_DOWNGRADE)

  case object Origin
    extends HeadersReferrerPolicy(software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy.ORIGIN)

  case object OriginWhenCrossOrigin
    extends HeadersReferrerPolicy(software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy.ORIGIN_WHEN_CROSS_ORIGIN)

  case object SameOrigin
    extends HeadersReferrerPolicy(software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy.SAME_ORIGIN)

  case object StrictOrigin
    extends HeadersReferrerPolicy(software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy.STRICT_ORIGIN)

  case object StrictOriginWhenCrossOrigin
    extends HeadersReferrerPolicy(software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy.STRICT_ORIGIN_WHEN_CROSS_ORIGIN)

  case object UnsafeUrl
    extends HeadersReferrerPolicy(software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy.UNSAFE_URL)
}
