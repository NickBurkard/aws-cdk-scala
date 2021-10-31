package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualGatewayClientPolicyProperty {

  def apply(
    tls: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyTlsProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyProperty.Builder)
      .tls(tls.orNull)
      .build()
}
