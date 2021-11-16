package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MountPoint {

  def apply(
    readOnly: Boolean,
    sourceVolume: String,
    containerPath: String
  ): software.amazon.awscdk.services.ecs.MountPoint =
    (new software.amazon.awscdk.services.ecs.MountPoint.Builder)
      .readOnly(readOnly)
      .sourceVolume(sourceVolume)
      .containerPath(containerPath)
      .build()
}
