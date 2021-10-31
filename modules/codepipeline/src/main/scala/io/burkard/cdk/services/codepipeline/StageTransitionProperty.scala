package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StageTransitionProperty {

  def apply(
    reason: Option[String] = None,
    stageName: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty =
    (new software.amazon.awscdk.services.codepipeline.CfnPipeline.StageTransitionProperty.Builder)
      .reason(reason.orNull)
      .stageName(stageName.orNull)
      .build()
}
