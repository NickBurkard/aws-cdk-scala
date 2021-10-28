package io.burkard.cdk.services.servicediscovery

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnHttpNamespaceProps {

  def apply(
    name: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.servicediscovery.CfnHttpNamespaceProps =
    (new software.amazon.awscdk.services.servicediscovery.CfnHttpNamespaceProps.Builder)
      .name(name.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
