package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCloudFrontOriginAccessIdentityProps {

  def apply(
    cloudFrontOriginAccessIdentityConfig: software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty
  ): software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps =
    (new software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps.Builder)
      .cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig)
      .build()
}
