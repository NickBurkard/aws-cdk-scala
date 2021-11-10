package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResponseHeadersPolicy {

  def apply(
    internalResourceId: String,
    responseHeadersPolicyConfig: Option[software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy =
    software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.Builder
      .create(stackCtx, internalResourceId)
      .responseHeadersPolicyConfig(responseHeadersPolicyConfig.orNull)
      .build()
}
