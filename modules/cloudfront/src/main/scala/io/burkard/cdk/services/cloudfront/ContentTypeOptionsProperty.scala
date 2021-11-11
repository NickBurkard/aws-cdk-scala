package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ContentTypeOptionsProperty {

  def apply(
    `override`: Option[Boolean] = None
  ): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentTypeOptionsProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentTypeOptionsProperty.Builder)
      .`override`(`override`.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
