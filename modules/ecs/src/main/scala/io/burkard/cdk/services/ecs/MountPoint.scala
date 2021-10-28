package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MountPoint {

  def apply(
    readOnly: Option[Boolean] = None,
    sourceVolume: Option[String] = None,
    containerPath: Option[String] = None
  ): software.amazon.awscdk.services.ecs.MountPoint =
    (new software.amazon.awscdk.services.ecs.MountPoint.Builder)
      .readOnly(readOnly.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sourceVolume(sourceVolume.orNull)
      .containerPath(containerPath.orNull)
      .build()
}
