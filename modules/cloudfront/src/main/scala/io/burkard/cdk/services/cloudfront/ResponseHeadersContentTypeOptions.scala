package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResponseHeadersContentTypeOptions {

  def apply(
    `override`: Boolean
  ): software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions =
    (new software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions.Builder)
      .`override`(`override`)
      .build()
}
