package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomHeaderProperty {

  def apply(
    `override`: Boolean,
    header: String,
    value: String
  ): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeaderProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeaderProperty.Builder)
      .`override`(`override`)
      .header(header)
      .value(value)
      .build()
}
