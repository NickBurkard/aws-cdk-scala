package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CodeCommitSourceActionProps {

  def apply(
    repository: software.amazon.awscdk.services.codecommit.IRepository,
    output: software.amazon.awscdk.services.codepipeline.Artifact,
    codeBuildCloneOutput: Option[Boolean] = None,
    branch: Option[String] = None,
    variablesNamespace: Option[String] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    trigger: Option[software.amazon.awscdk.services.codepipeline.actions.CodeCommitTrigger] = None,
    eventRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None
  ): software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceActionProps =
    (new software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceActionProps.Builder)
      .repository(repository)
      .output(output)
      .codeBuildCloneOutput(codeBuildCloneOutput.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .branch(branch.orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .trigger(trigger.orNull)
      .eventRole(eventRole.orNull)
      .role(role.orNull)
      .build()
}
