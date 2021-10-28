package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PublicDnsNamespaceProps {

  def apply(
    name: Option[String] = None,
    description: Option[String] = None
  ): software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceProps =
    (new software.amazon.awscdk.services.servicediscovery.PublicDnsNamespaceProps.Builder)
      .name(name.orNull)
      .description(description.orNull)
      .build()
}
