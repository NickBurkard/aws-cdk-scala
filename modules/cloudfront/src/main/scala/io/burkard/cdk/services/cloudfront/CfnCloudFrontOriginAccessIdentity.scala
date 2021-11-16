package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCloudFrontOriginAccessIdentity {

  def apply(
    internalResourceId: String,
    cloudFrontOriginAccessIdentityConfig: software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity =
    software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.Builder
      .create(stackCtx, internalResourceId)
      .cloudFrontOriginAccessIdentityConfig(cloudFrontOriginAccessIdentityConfig)
      .build()
}
