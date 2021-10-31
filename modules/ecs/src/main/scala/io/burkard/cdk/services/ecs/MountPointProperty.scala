package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MountPointProperty {

  def apply(
    readOnly: Option[Boolean] = None,
    sourceVolume: Option[String] = None,
    containerPath: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.MountPointProperty.Builder)
      .readOnly(readOnly.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sourceVolume(sourceVolume.orNull)
      .containerPath(containerPath.orNull)
      .build()
}
