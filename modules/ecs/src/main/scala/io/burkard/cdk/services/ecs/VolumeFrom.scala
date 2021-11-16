package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VolumeFrom {

  def apply(
    readOnly: Boolean,
    sourceContainer: String
  ): software.amazon.awscdk.services.ecs.VolumeFrom =
    (new software.amazon.awscdk.services.ecs.VolumeFrom.Builder)
      .readOnly(readOnly)
      .sourceContainer(sourceContainer)
      .build()
}
