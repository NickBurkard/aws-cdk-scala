package io.burkard.cdk.services.cloudfront

sealed abstract class CloudFrontAllowedMethods(val underlying: software.amazon.awscdk.services.cloudfront.CloudFrontAllowedMethods)
  extends Product
    with Serializable

object CloudFrontAllowedMethods {
  implicit def toAws(value: CloudFrontAllowedMethods): software.amazon.awscdk.services.cloudfront.CloudFrontAllowedMethods =
    Option(value).map(_.underlying).orNull

  case object GetHead
    extends CloudFrontAllowedMethods(software.amazon.awscdk.services.cloudfront.CloudFrontAllowedMethods.GET_HEAD)

  case object GetHeadOptions
    extends CloudFrontAllowedMethods(software.amazon.awscdk.services.cloudfront.CloudFrontAllowedMethods.GET_HEAD_OPTIONS)

  case object All
    extends CloudFrontAllowedMethods(software.amazon.awscdk.services.cloudfront.CloudFrontAllowedMethods.ALL)
}
