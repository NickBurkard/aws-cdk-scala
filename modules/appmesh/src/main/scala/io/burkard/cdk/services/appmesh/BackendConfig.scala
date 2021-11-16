package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BackendConfig {

  def apply(
    virtualServiceBackend: software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendProperty
  ): software.amazon.awscdk.services.appmesh.BackendConfig =
    (new software.amazon.awscdk.services.appmesh.BackendConfig.Builder)
      .virtualServiceBackend(virtualServiceBackend)
      .build()
}
