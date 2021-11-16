package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScratchSpace {

  def apply(
    name: String,
    readOnly: Boolean,
    sourcePath: String,
    containerPath: String
  ): software.amazon.awscdk.services.ecs.ScratchSpace =
    (new software.amazon.awscdk.services.ecs.ScratchSpace.Builder)
      .name(name)
      .readOnly(readOnly)
      .sourcePath(sourcePath)
      .containerPath(containerPath)
      .build()
}
