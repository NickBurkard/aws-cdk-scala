package io.burkard.cdk.services.cloudfront

sealed abstract class HeadersFrameOption(val underlying: software.amazon.awscdk.services.cloudfront.HeadersFrameOption)
  extends Product
    with Serializable

object HeadersFrameOption {
  implicit def toAws(value: HeadersFrameOption): software.amazon.awscdk.services.cloudfront.HeadersFrameOption =
    Option(value).map(_.underlying).orNull

  case object Deny
    extends HeadersFrameOption(software.amazon.awscdk.services.cloudfront.HeadersFrameOption.DENY)

  case object Sameorigin
    extends HeadersFrameOption(software.amazon.awscdk.services.cloudfront.HeadersFrameOption.SAMEORIGIN)
}
