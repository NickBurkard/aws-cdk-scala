package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DnsServiceDiscoveryProperty {

  def apply(
    hostname: Option[String] = None,
    responseType: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.DnsServiceDiscoveryProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.DnsServiceDiscoveryProperty.Builder)
      .hostname(hostname.orNull)
      .responseType(responseType.orNull)
      .build()
}
