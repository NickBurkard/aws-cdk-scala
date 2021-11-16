package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ArtifactDetailsProperty {

  def apply(
    maximumCount: Number,
    minimumCount: Number
  ): software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty =
    (new software.amazon.awscdk.services.codepipeline.CfnCustomActionType.ArtifactDetailsProperty.Builder)
      .maximumCount(maximumCount)
      .minimumCount(minimumCount)
      .build()
}
