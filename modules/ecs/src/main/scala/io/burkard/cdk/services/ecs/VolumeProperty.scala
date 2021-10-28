package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VolumeProperty {

  def apply(
    dockerVolumeConfiguration: Option[software.amazon.awscdk.services.ecs.CfnTaskDefinition.DockerVolumeConfigurationProperty] = None,
    name: Option[String] = None,
    host: Option[software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty] = None,
    efsVolumeConfiguration: Option[software.amazon.awscdk.services.ecs.CfnTaskDefinition.EfsVolumeConfigurationProperty] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.VolumeProperty.Builder)
      .dockerVolumeConfiguration(dockerVolumeConfiguration.orNull)
      .name(name.orNull)
      .host(host.orNull)
      .efsVolumeConfiguration(efsVolumeConfiguration.orNull)
      .build()
}
