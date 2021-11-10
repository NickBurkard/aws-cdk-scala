package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FrameOptionsProperty {

  def apply(
    frameOption: Option[String] = None,
    `override`: Option[Boolean] = None
  ): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.FrameOptionsProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.FrameOptionsProperty.Builder)
      .frameOption(frameOption.orNull)
      .`override`(`override`.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
