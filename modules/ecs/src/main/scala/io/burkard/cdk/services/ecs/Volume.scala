package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Volume {

  def apply(
    name: String,
    dockerVolumeConfiguration: Option[software.amazon.awscdk.services.ecs.DockerVolumeConfiguration] = None,
    host: Option[software.amazon.awscdk.services.ecs.Host] = None,
    efsVolumeConfiguration: Option[software.amazon.awscdk.services.ecs.EfsVolumeConfiguration] = None
  ): software.amazon.awscdk.services.ecs.Volume =
    (new software.amazon.awscdk.services.ecs.Volume.Builder)
      .name(name)
      .dockerVolumeConfiguration(dockerVolumeConfiguration.orNull)
      .host(host.orNull)
      .efsVolumeConfiguration(efsVolumeConfiguration.orNull)
      .build()
}
