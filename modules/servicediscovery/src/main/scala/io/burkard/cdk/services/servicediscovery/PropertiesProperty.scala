package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PropertiesProperty {

  def apply(
    dnsProperties: Option[software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PublicDnsPropertiesMutableProperty] = None
  ): software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PropertiesProperty =
    (new software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PropertiesProperty.Builder)
      .dnsProperties(dnsProperties.orNull)
      .build()
}
