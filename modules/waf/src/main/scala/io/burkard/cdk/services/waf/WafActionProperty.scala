package io.burkard.cdk.services.waf

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WafActionProperty {

  def apply(
    `type`: String
  ): software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty =
    (new software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty.Builder)
      .`type`(`type`)
      .build()
}
