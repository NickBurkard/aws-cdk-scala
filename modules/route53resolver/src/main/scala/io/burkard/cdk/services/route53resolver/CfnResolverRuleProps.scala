package io.burkard.cdk.services.route53resolver

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResolverRuleProps {

  def apply(
    domainName: String,
    ruleType: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    targetIps: Option[List[_]] = None,
    resolverEndpointId: Option[String] = None
  ): software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps =
    (new software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps.Builder)
      .domainName(domainName)
      .ruleType(ruleType)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .targetIps(targetIps.map(_.asJava).orNull)
      .resolverEndpointId(resolverEndpointId.orNull)
      .build()
}
