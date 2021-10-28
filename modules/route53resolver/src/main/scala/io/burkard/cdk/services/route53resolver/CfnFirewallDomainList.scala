package io.burkard.cdk.services.route53resolver

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFirewallDomainList {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    domains: Option[List[String]] = None,
    domainFileUrl: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53resolver.CfnFirewallDomainList =
    software.amazon.awscdk.services.route53resolver.CfnFirewallDomainList.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .domains(domains.map(_.asJava).orNull)
      .domainFileUrl(domainFileUrl.orNull)
      .build()
}
