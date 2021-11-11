package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object XSSProtectionProperty {

  def apply(
    `override`: Option[Boolean] = None,
    modeBlock: Option[Boolean] = None,
    protection: Option[Boolean] = None,
    reportUri: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.XSSProtectionProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.XSSProtectionProperty.Builder)
      .`override`(`override`.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .modeBlock(modeBlock.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .protection(protection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .reportUri(reportUri.orNull)
      .build()
}
