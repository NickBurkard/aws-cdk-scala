package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Volume {

  def apply(
    dockerVolumeConfiguration: Option[software.amazon.awscdk.services.ecs.DockerVolumeConfiguration] = None,
    name: Option[String] = None,
    host: Option[software.amazon.awscdk.services.ecs.Host] = None,
    efsVolumeConfiguration: Option[software.amazon.awscdk.services.ecs.EfsVolumeConfiguration] = None
  ): software.amazon.awscdk.services.ecs.Volume =
    (new software.amazon.awscdk.services.ecs.Volume.Builder)
      .dockerVolumeConfiguration(dockerVolumeConfiguration.orNull)
      .name(name.orNull)
      .host(host.orNull)
      .efsVolumeConfiguration(efsVolumeConfiguration.orNull)
      .build()
}
