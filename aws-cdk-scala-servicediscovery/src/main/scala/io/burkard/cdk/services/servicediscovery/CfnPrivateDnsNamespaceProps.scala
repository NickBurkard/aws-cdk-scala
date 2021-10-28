package io.burkard.cdk.services.servicediscovery

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPrivateDnsNamespaceProps {

  def apply(
    name: Option[String] = None,
    properties: Option[software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PropertiesProperty] = None,
    vpc: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespaceProps =
    (new software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespaceProps.Builder)
      .name(name.orNull)
      .properties(properties.orNull)
      .vpc(vpc.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
