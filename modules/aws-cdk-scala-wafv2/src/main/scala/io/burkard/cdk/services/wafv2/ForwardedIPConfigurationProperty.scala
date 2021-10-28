package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ForwardedIPConfigurationProperty {

  def apply(
    headerName: Option[String] = None,
    fallbackBehavior: Option[String] = None
  ): software.amazon.awscdk.services.wafv2.CfnRuleGroup.ForwardedIPConfigurationProperty =
    (new software.amazon.awscdk.services.wafv2.CfnRuleGroup.ForwardedIPConfigurationProperty.Builder)
      .headerName(headerName.orNull)
      .fallbackBehavior(fallbackBehavior.orNull)
      .build()
}
