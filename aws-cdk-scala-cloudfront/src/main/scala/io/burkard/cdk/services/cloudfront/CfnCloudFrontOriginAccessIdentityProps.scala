package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCloudFrontOriginAccessIdentityProps {

  def apply(
    cloudFrontOriginAccessIdentityConfig: Option[software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty] = None
  ): software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps =
    (new software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps.Builder)
      .cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig.orNull)
      .build()
}
