package io.burkard.cdk.services.servicediscovery

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPublicDnsNamespace {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    properties: Option[software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.PropertiesProperty] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace =
    software.amazon.awscdk.services.servicediscovery.CfnPublicDnsNamespace.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .properties(properties.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
