package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CodeCommitSourceOptions {

  def apply(
    codeBuildCloneOutput: Option[Boolean] = None,
    eventRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    trigger: Option[software.amazon.awscdk.services.codepipeline.actions.CodeCommitTrigger] = None
  ): software.amazon.awscdk.pipelines.CodeCommitSourceOptions =
    (new software.amazon.awscdk.pipelines.CodeCommitSourceOptions.Builder)
      .codeBuildCloneOutput(codeBuildCloneOutput.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .eventRole(eventRole.orNull)
      .trigger(trigger.orNull)
      .build()
}
