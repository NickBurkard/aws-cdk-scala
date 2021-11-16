package io.burkard.cdk.services.route53resolver

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResolverEndpoint {

  def apply(
    internalResourceId: String,
    securityGroupIds: List[String],
    direction: String,
    ipAddresses: List[_],
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint =
    software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.Builder
      .create(stackCtx, internalResourceId)
      .securityGroupIds(securityGroupIds.asJava)
      .direction(direction)
      .ipAddresses(ipAddresses.asJava)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
