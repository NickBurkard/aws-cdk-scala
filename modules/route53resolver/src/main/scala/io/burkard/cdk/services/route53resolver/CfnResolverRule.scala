package io.burkard.cdk.services.route53resolver

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResolverRule {

  def apply(
    internalResourceId: String,
    domainName: String,
    ruleType: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    targetIps: Option[List[_]] = None,
    resolverEndpointId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53resolver.CfnResolverRule =
    software.amazon.awscdk.services.route53resolver.CfnResolverRule.Builder
      .create(stackCtx, internalResourceId)
      .domainName(domainName)
      .ruleType(ruleType)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .targetIps(targetIps.map(_.asJava).orNull)
      .resolverEndpointId(resolverEndpointId.orNull)
      .build()
}
