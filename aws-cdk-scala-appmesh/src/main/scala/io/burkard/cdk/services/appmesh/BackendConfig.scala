package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BackendConfig {

  def apply(
    virtualServiceBackend: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.BackendProperty] = None
  ): software.amazon.awscdk.services.appmesh.BackendConfig =
    (new software.amazon.awscdk.services.appmesh.BackendConfig.Builder)
      .virtualServiceBackend(virtualServiceBackend.orNull)
      .build()
}
