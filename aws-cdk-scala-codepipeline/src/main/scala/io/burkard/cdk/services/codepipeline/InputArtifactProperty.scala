package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InputArtifactProperty {

  def apply(
    name: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty =
    (new software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty.Builder)
      .name(name.orNull)
      .build()
}
