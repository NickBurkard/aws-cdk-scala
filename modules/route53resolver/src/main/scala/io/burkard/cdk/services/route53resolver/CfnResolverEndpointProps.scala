package io.burkard.cdk.services.route53resolver

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResolverEndpointProps {

  def apply(
    securityGroupIds: List[String],
    direction: String,
    ipAddresses: List[_],
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps =
    (new software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps.Builder)
      .securityGroupIds(securityGroupIds.asJava)
      .direction(direction)
      .ipAddresses(ipAddresses.asJava)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
