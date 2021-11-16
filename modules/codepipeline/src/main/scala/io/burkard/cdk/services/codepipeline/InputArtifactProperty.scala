package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InputArtifactProperty {

  def apply(
    name: String
  ): software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty =
    (new software.amazon.awscdk.services.codepipeline.CfnPipeline.InputArtifactProperty.Builder)
      .name(name)
      .build()
}
