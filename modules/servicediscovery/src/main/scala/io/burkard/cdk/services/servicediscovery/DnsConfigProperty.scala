package io.burkard.cdk.services.servicediscovery

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DnsConfigProperty {

  def apply(
    dnsRecords: Option[List[_]] = None,
    routingPolicy: Option[String] = None,
    namespaceId: Option[String] = None
  ): software.amazon.awscdk.services.servicediscovery.CfnService.DnsConfigProperty =
    (new software.amazon.awscdk.services.servicediscovery.CfnService.DnsConfigProperty.Builder)
      .dnsRecords(dnsRecords.map(_.asJava).orNull)
      .routingPolicy(routingPolicy.orNull)
      .namespaceId(namespaceId.orNull)
      .build()
}
