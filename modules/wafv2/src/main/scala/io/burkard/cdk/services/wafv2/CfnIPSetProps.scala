package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnIPSetProps {

  def apply(
    ipAddressVersion: String,
    addresses: List[String],
    scope: String,
    name: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.wafv2.CfnIPSetProps =
    (new software.amazon.awscdk.services.wafv2.CfnIPSetProps.Builder)
      .ipAddressVersion(ipAddressVersion)
      .addresses(addresses.asJava)
      .scope(scope)
      .name(name.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
