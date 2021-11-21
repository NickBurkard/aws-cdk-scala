package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SOAProperty {

  def apply(
    ttl: Option[Number] = None
  ): software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.SOAProperty =
    (new software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.SOAProperty.Builder)
      .ttl(ttl.orNull)
      .build()
}
