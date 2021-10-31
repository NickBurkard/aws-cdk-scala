package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BackendDefaultsProperty {

  def apply(
    clientPolicy: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendDefaultsProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendDefaultsProperty.Builder)
      .clientPolicy(clientPolicy.orNull)
      .build()
}
