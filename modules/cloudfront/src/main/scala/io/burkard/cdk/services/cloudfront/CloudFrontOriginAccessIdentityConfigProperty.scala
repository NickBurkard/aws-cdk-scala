package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CloudFrontOriginAccessIdentityConfigProperty {

  def apply(
    comment: String
  ): software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty.Builder)
      .comment(comment)
      .build()
}
