package io.burkard.cdk.services.servicediscovery

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnServiceProps {

  def apply(
    name: Option[String] = None,
    healthCheckCustomConfig: Option[software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckCustomConfigProperty] = None,
    namespaceId: Option[String] = None,
    healthCheckConfig: Option[software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckConfigProperty] = None,
    dnsConfig: Option[software.amazon.awscdk.services.servicediscovery.CfnService.DnsConfigProperty] = None,
    `type`: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.servicediscovery.CfnServiceProps =
    (new software.amazon.awscdk.services.servicediscovery.CfnServiceProps.Builder)
      .name(name.orNull)
      .healthCheckCustomConfig(healthCheckCustomConfig.orNull)
      .namespaceId(namespaceId.orNull)
      .healthCheckConfig(healthCheckConfig.orNull)
      .dnsConfig(dnsConfig.orNull)
      .`type`(`type`.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
