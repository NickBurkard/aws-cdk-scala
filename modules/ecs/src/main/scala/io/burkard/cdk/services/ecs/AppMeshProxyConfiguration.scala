package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AppMeshProxyConfiguration {

  def apply(
    containerName: Option[String] = None,
    properties: Option[software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps] = None
  ): software.amazon.awscdk.services.ecs.AppMeshProxyConfiguration =
    software.amazon.awscdk.services.ecs.AppMeshProxyConfiguration.Builder
      .create()
      .containerName(containerName.orNull)
      .properties(properties.orNull)
      .build()
}
