package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResponseHeadersFrameOptions {

  def apply(
    frameOption: software.amazon.awscdk.services.cloudfront.HeadersFrameOption,
    `override`: Boolean
  ): software.amazon.awscdk.services.cloudfront.ResponseHeadersFrameOptions =
    (new software.amazon.awscdk.services.cloudfront.ResponseHeadersFrameOptions.Builder)
      .frameOption(frameOption)
      .`override`(`override`)
      .build()
}
