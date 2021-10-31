package io.burkard.cdk.services.route53resolver

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResolverEndpoint {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    securityGroupIds: Option[List[String]] = None,
    direction: Option[String] = None,
    ipAddresses: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint =
    software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .direction(direction.orNull)
      .ipAddresses(ipAddresses.map(_.asJava).orNull)
      .build()
}
