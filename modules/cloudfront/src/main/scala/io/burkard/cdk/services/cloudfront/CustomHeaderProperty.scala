package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomHeaderProperty {

  def apply(
    `override`: Option[Boolean] = None,
    header: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeaderProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeaderProperty.Builder)
      .`override`(`override`.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .header(header.orNull)
      .value(value.orNull)
      .build()
}
