package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VolumesHostProperty {

  def apply(
    sourcePath: Option[String] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesHostProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.VolumesHostProperty.Builder)
      .sourcePath(sourcePath.orNull)
      .build()
}
