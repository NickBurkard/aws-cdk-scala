package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServiceDiscoveryProperty {

  def apply(
    dns: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.DnsServiceDiscoveryProperty] = None,
    awsCloudMap: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.ServiceDiscoveryProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.ServiceDiscoveryProperty.Builder)
      .dns(dns.orNull)
      .awsCloudMap(awsCloudMap.orNull)
      .build()
}
