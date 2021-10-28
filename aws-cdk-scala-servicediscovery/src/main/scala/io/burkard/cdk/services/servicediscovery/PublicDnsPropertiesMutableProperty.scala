package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PublicDnsPropertiesMutableProperty {

  def apply(
    soa: Option[software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.SOAProperty] = None
  ): software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PublicDnsPropertiesMutableProperty =
    (new software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PublicDnsPropertiesMutableProperty.Builder)
      .soa(soa.orNull)
      .build()
}
