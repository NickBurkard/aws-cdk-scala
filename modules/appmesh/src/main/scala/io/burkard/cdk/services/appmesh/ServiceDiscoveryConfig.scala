package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServiceDiscoveryConfig {

  def apply(
    dns: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.DnsServiceDiscoveryProperty] = None,
    cloudmap: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty] = None
  ): software.amazon.awscdk.services.appmesh.ServiceDiscoveryConfig =
    (new software.amazon.awscdk.services.appmesh.ServiceDiscoveryConfig.Builder)
      .dns(dns.orNull)
      .cloudmap(cloudmap.orNull)
      .build()
}
