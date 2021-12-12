package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResponseHeadersXSSProtection {

  def apply(
    `override`: Boolean,
    protection: Boolean,
    modeBlock: Option[Boolean] = None,
    reportUri: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection =
    (new software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection.Builder)
      .`override`(`override`)
      .protection(protection)
      .modeBlock(modeBlock.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .reportUri(reportUri.orNull)
      .build()
}
