package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ActionArtifactBounds {

  def apply(
    maxOutputs: Option[Number] = None,
    maxInputs: Option[Number] = None,
    minInputs: Option[Number] = None,
    minOutputs: Option[Number] = None
  ): software.amazon.awscdk.services.codepipeline.ActionArtifactBounds =
    (new software.amazon.awscdk.services.codepipeline.ActionArtifactBounds.Builder)
      .maxOutputs(maxOutputs.orNull)
      .maxInputs(maxInputs.orNull)
      .minInputs(minInputs.orNull)
      .minOutputs(minOutputs.orNull)
      .build()
}
