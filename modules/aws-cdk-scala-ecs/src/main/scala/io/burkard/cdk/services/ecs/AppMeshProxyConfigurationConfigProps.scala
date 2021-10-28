package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AppMeshProxyConfigurationConfigProps {

  def apply(
    containerName: Option[String] = None,
    properties: Option[software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationProps] = None
  ): software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationConfigProps =
    (new software.amazon.awscdk.services.ecs.AppMeshProxyConfigurationConfigProps.Builder)
      .containerName(containerName.orNull)
      .properties(properties.orNull)
      .build()
}
