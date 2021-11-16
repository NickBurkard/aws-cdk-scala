package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CodeDeployEcsContainerImageInput {

  def apply(
    input: software.amazon.awscdk.services.codepipeline.Artifact,
    taskDefinitionPlaceholder: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsContainerImageInput =
    (new software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsContainerImageInput.Builder)
      .input(input)
      .taskDefinitionPlaceholder(taskDefinitionPlaceholder.orNull)
      .build()
}
