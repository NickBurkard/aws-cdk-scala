package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClientPolicyProperty {

  def apply(
    tls: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyTlsProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyProperty.Builder)
      .tls(tls.orNull)
      .build()
}
