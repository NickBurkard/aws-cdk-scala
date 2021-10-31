package io.burkard.cdk.services.route53resolver

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResolverRuleProps {

  def apply(
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    domainName: Option[String] = None,
    ruleType: Option[String] = None,
    targetIps: Option[List[_]] = None,
    resolverEndpointId: Option[String] = None
  ): software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps =
    (new software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps.Builder)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .domainName(domainName.orNull)
      .ruleType(ruleType.orNull)
      .targetIps(targetIps.map(_.asJava).orNull)
      .resolverEndpointId(resolverEndpointId.orNull)
      .build()
}
