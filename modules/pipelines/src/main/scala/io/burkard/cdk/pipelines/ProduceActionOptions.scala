package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProduceActionOptions {

  def apply(
    artifacts: software.amazon.awscdk.pipelines.ArtifactMap,
    scope: software.constructs.Construct,
    pipeline: software.amazon.awscdk.pipelines.CodePipeline,
    runOrder: Number,
    actionName: String,
    codeBuildDefaults: Option[software.amazon.awscdk.pipelines.CodeBuildOptions] = None,
    fallbackArtifact: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    beforeSelfMutation: Option[Boolean] = None
  ): software.amazon.awscdk.pipelines.ProduceActionOptions =
    (new software.amazon.awscdk.pipelines.ProduceActionOptions.Builder)
      .artifacts(artifacts)
      .scope(scope)
      .pipeline(pipeline)
      .runOrder(runOrder)
      .actionName(actionName)
      .codeBuildDefaults(codeBuildDefaults.orNull)
      .fallbackArtifact(fallbackArtifact.orNull)
      .beforeSelfMutation(beforeSelfMutation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
