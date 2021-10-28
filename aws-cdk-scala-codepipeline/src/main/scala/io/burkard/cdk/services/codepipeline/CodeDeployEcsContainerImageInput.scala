package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CodeDeployEcsContainerImageInput {

  def apply(
    taskDefinitionPlaceholder: Option[String] = None,
    input: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None
  ): software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsContainerImageInput =
    (new software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsContainerImageInput.Builder)
      .taskDefinitionPlaceholder(taskDefinitionPlaceholder.orNull)
      .input(input.orNull)
      .build()
}
