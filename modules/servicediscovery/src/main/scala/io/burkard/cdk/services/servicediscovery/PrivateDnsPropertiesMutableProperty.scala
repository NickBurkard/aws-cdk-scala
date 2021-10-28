package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PrivateDnsPropertiesMutableProperty {

  def apply(
    soa: Option[software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.SOAProperty] = None
  ): software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty =
    (new software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty.Builder)
      .soa(soa.orNull)
      .build()
}
