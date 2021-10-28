package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ScratchSpace {

  def apply(
    name: Option[String] = None,
    readOnly: Option[Boolean] = None,
    sourcePath: Option[String] = None,
    containerPath: Option[String] = None
  ): software.amazon.awscdk.services.ecs.ScratchSpace =
    (new software.amazon.awscdk.services.ecs.ScratchSpace.Builder)
      .name(name.orNull)
      .readOnly(readOnly.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sourcePath(sourcePath.orNull)
      .containerPath(containerPath.orNull)
      .build()
}
