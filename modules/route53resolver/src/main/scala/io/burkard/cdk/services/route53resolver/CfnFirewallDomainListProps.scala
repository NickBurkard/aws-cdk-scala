package io.burkard.cdk.services.route53resolver

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFirewallDomainListProps {

  def apply(
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    domains: Option[List[String]] = None,
    domainFileUrl: Option[String] = None
  ): software.amazon.awscdk.services.route53resolver.CfnFirewallDomainListProps =
    (new software.amazon.awscdk.services.route53resolver.CfnFirewallDomainListProps.Builder)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .domains(domains.map(_.asJava).orNull)
      .domainFileUrl(domainFileUrl.orNull)
      .build()
}
