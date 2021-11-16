package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AppMeshProxyConfigurationConfigProps {

  def apply(
    containerName: String,
    properties: software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps
  ): software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationConfigProps =
    (new software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationConfigProps.Builder)
      .containerName(containerName)
      .properties(properties)
      .build()
}
