package io.burkard.cdk.services.servicediscovery

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
