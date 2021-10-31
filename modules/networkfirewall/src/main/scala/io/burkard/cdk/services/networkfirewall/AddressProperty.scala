package io.burkard.cdk.services.networkfirewall

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AddressProperty {

  def apply(
    addressDefinition: Option[String] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.AddressProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.AddressProperty.Builder)
      .addressDefinition(addressDefinition.orNull)
      .build()
}
