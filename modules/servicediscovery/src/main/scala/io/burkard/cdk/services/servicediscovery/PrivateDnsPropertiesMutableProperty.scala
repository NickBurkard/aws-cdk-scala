package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PrivateDnsPropertiesMutableProperty {

  def apply(
    soa: Option[software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.SOAProperty] = None
  ): software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty =
    (new software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PrivateDnsPropertiesMutableProperty.Builder)
      .soa(soa.orNull)
      .build()
}
