package io.burkard.cdk.services.cloudfront

sealed abstract class CloudFrontAllowedCachedMethods(val underlying: software.amazon.awscdk.services.cloudfront.CloudFrontAllowedCachedMethods)
  extends Product
    with Serializable

object CloudFrontAllowedCachedMethods {
  implicit def toAws(value: CloudFrontAllowedCachedMethods): software.amazon.awscdk.services.cloudfront.CloudFrontAllowedCachedMethods =
    Option(value).map(_.underlying).orNull

  case object GetHead
    extends CloudFrontAllowedCachedMethods(software.amazon.awscdk.services.cloudfront.CloudFrontAllowedCachedMethods.GET_HEAD)

  case object GetHeadOptions
    extends CloudFrontAllowedCachedMethods(software.amazon.awscdk.services.cloudfront.CloudFrontAllowedCachedMethods.GET_HEAD_OPTIONS)
}
