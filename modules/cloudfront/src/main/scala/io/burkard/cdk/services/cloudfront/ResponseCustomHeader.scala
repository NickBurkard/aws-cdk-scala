package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResponseCustomHeader {

  def apply(
    `override`: Boolean,
    header: String,
    value: String
  ): software.amazon.awscdk.services.cloudfront.ResponseCustomHeader =
    (new software.amazon.awscdk.services.cloudfront.ResponseCustomHeader.Builder)
      .`override`(`override`)
      .header(header)
      .value(value)
      .build()
}
