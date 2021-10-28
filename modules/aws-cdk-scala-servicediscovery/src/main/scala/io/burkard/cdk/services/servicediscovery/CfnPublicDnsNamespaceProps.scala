package io.burkard.cdk.services.servicediscovery

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPublicDnsNamespaceProps {

  def apply(
    name: Option[String] = None,
    properties: Option[software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PropertiesProperty] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespaceProps =
    (new software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespaceProps.Builder)
      .name(name.orNull)
      .properties(properties.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
