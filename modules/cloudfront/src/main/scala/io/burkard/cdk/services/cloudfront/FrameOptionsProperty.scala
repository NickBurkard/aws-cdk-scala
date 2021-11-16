package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FrameOptionsProperty {

  def apply(
    frameOption: String,
    `override`: Boolean
  ): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.FrameOptionsProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.FrameOptionsProperty.Builder)
      .frameOption(frameOption)
      .`override`(`override`)
      .build()
}
