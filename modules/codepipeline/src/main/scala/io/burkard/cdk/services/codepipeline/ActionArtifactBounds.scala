package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ActionArtifactBounds {

  def apply(
    maxOutputs: Number,
    maxInputs: Number,
    minInputs: Number,
    minOutputs: Number
  ): software.amazon.awscdk.services.codepipeline.ActionArtifactBounds =
    (new software.amazon.awscdk.services.codepipeline.ActionArtifactBounds.Builder)
      .maxOutputs(maxOutputs)
      .maxInputs(maxInputs)
      .minInputs(minInputs)
      .minOutputs(minOutputs)
      .build()
}
