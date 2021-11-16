package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ForwardedIPConfigurationProperty {

  def apply(
    headerName: String,
    fallbackBehavior: String
  ): software.amazon.awscdk.services.wafv2.CfnRuleGroup.ForwardedIPConfigurationProperty =
    (new software.amazon.awscdk.services.wafv2.CfnRuleGroup.ForwardedIPConfigurationProperty.Builder)
      .headerName(headerName)
      .fallbackBehavior(fallbackBehavior)
      .build()
}
