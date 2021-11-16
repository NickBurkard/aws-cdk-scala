package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object XSSProtectionProperty {

  def apply(
    `override`: Boolean,
    protection: Boolean,
    modeBlock: Option[Boolean] = None,
    reportUri: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.XSSProtectionProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.XSSProtectionProperty.Builder)
      .`override`(`override`)
      .protection(protection)
      .modeBlock(modeBlock.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .reportUri(reportUri.orNull)
      .build()
}
