package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StageTransitionProperty {

  def apply(
    reason: String,
    stageName: String
  ): software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty =
    (new software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty.Builder)
      .reason(reason)
      .stageName(stageName)
      .build()
}
