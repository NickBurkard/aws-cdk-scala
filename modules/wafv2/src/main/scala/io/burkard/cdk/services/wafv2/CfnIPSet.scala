package io.burkard.cdk.services.wafv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnIPSet {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    ipAddressVersion: Option[String] = None,
    addresses: Option[List[String]] = None,
    description: Option[String] = None,
    scope: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.wafv2.CfnIPSet =
    software.amazon.awscdk.services.wafv2.CfnIPSet.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .ipAddressVersion(ipAddressVersion.orNull)
      .addresses(addresses.map(_.asJava).orNull)
      .description(description.orNull)
      .scope(scope.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}