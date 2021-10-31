package io.burkard.cdk.services.servicediscovery

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPrivateDnsNamespace {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    properties: Option[software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.PropertiesProperty] = None,
    vpc: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace =
    software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .properties(properties.orNull)
      .vpc(vpc.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
