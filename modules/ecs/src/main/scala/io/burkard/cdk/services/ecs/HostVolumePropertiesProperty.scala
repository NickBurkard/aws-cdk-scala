package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HostVolumePropertiesProperty {

  def apply(
    sourcePath: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostVolumePropertiesProperty.Builder)
      .sourcePath(sourcePath.orNull)
      .build()
}
