package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LabelProperty {

  def apply(
    name: String
  ): software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelProperty =
    (new software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelProperty.Builder)
      .name(name)
      .build()
}
