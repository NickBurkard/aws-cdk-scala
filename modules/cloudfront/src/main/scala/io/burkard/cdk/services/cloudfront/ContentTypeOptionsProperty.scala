package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ContentTypeOptionsProperty {

  def apply(
    `override`: Boolean
  ): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentTypeOptionsProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentTypeOptionsProperty.Builder)
      .`override`(`override`)
      .build()
}
