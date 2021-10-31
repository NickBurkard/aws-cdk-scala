package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProduceActionOptions {

  def apply(
    artifacts: Option[software.amazon.awscdk.pipelines.ArtifactMap] = None,
    scope: Option[software.constructs.Construct] = None,
    codeBuildDefaults: Option[software.amazon.awscdk.pipelines.CodeBuildOptions] = None,
    fallbackArtifact: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    pipeline: Option[software.amazon.awscdk.pipelines.CodePipeline] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    beforeSelfMutation: Option[Boolean] = None
  ): software.amazon.awscdk.pipelines.ProduceActionOptions =
    (new software.amazon.awscdk.pipelines.ProduceActionOptions.Builder)
      .artifacts(artifacts.orNull)
      .scope(scope.orNull)
      .codeBuildDefaults(codeBuildDefaults.orNull)
      .fallbackArtifact(fallbackArtifact.orNull)
      .pipeline(pipeline.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .beforeSelfMutation(beforeSelfMutation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
