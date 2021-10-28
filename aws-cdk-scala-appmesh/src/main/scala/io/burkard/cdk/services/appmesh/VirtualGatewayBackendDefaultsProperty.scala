package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualGatewayBackendDefaultsProperty {

  def apply(
    clientPolicy: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayClientPolicyProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayBackendDefaultsProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayBackendDefaultsProperty.Builder)
      .clientPolicy(clientPolicy.orNull)
      .build()
}
