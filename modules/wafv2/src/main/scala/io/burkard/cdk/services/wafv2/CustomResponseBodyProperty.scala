package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomResponseBodyProperty {

  def apply(
    contentType: String,
    content: String
  ): software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomResponseBodyProperty =
    (new software.amazon.awscdk.services.wafv2.CfnRuleGroup.CustomResponseBodyProperty.Builder)
      .contentType(contentType)
      .content(content)
      .build()
}
