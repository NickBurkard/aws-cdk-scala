package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CodePipelineActionFactoryResult {

  def apply(
    runOrdersConsumed: Option[Number] = None,
    project: Option[software.amazon.awscdk.services.codebuild.IProject] = None
  ): software.amazon.awscdk.pipelines.CodePipelineActionFactoryResult =
    (new software.amazon.awscdk.pipelines.CodePipelineActionFactoryResult.Builder)
      .runOrdersConsumed(runOrdersConsumed.orNull)
      .project(project.orNull)
      .build()
}
