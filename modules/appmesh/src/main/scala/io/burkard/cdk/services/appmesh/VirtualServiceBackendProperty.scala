package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualServiceBackendProperty {

  def apply(
    virtualServiceName: String,
    clientPolicy: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.ClientPolicyProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualServiceBackendProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.VirtualServiceBackendProperty.Builder)
      .virtualServiceName(virtualServiceName)
      .clientPolicy(clientPolicy.orNull)
      .build()
}
