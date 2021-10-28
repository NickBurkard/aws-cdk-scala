package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MountPointsProperty {

  def apply(
    readOnly: Option[Boolean] = None,
    sourceVolume: Option[String] = None,
    containerPath: Option[String] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.MountPointsProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.MountPointsProperty.Builder)
      .readOnly(readOnly.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sourceVolume(sourceVolume.orNull)
      .containerPath(containerPath.orNull)
      .build()
}
