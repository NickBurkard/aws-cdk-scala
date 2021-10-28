package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ClientPolicyProperty {

  def apply(
    tls: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyTlsProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyProperty.Builder)
      .tls(tls.orNull)
      .build()
}
