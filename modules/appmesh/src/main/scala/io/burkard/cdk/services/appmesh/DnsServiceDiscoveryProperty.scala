package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DnsServiceDiscoveryProperty {

  def apply(
    hostname: String,
    responseType: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.DnsServiceDiscoveryProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.DnsServiceDiscoveryProperty.Builder)
      .hostname(hostname)
      .responseType(responseType.orNull)
      .build()
}
