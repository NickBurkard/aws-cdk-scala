package io.burkard.cdk.services.servicediscovery

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPrivateDnsNamespaceProps {

  def apply(
    name: String,
    vpc: String,
    properties: Option[software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PropertiesProperty] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespaceProps =
    (new software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespaceProps.Builder)
      .name(name)
      .vpc(vpc)
      .properties(properties.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
