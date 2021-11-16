package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AppMeshProxyConfiguration {

  def apply(
    containerName: String,
    properties: software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps
  ): software.amazon.awscdk.services.ecs.AppMeshProxyConfiguration =
    software.amazon.awscdk.services.ecs.AppMeshProxyConfiguration.Builder
      .create()
      .containerName(containerName)
      .properties(properties)
      .build()
}
