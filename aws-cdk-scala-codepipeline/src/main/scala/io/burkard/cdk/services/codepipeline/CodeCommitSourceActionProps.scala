package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CodeCommitSourceActionProps {

  def apply(
    codeBuildCloneOutput: Option[Boolean] = None,
    repository: Option[software.amazon.awscdk.services.codecommit.IRepository] = None,
    branch: Option[String] = None,
    variablesNamespace: Option[String] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    output: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None,
    trigger: Option[software.amazon.awscdk.services.codepipeline.actions.CodeCommitTrigger] = None,
    eventRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None
  ): software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceActionProps =
    (new software.amazon.awscdk.services.codepipeline.actions.CodeCommitSourceActionProps.Builder)
      .codeBuildCloneOutput(codeBuildCloneOutput.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .repository(repository.orNull)
      .branch(branch.orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .output(output.orNull)
      .trigger(trigger.orNull)
      .eventRole(eventRole.orNull)
      .role(role.orNull)
      .build()
}
