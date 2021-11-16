package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResponseHeadersPolicyProps {

  def apply(
    responseHeadersPolicyConfig: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty
  ): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicyProps =
    (new software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicyProps.Builder)
      .responseHeadersPolicyConfig(responseHeadersPolicyConfig)
      .build()
}
