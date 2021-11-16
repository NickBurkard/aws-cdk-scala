package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CodeStarConnectionsSourceActionProps {

  def apply(
    connectionArn: String,
    owner: String,
    repo: String,
    output: software.amazon.awscdk.services.codepipeline.Artifact,
    codeBuildCloneOutput: Option[Boolean] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    branch: Option[String] = None,
    variablesNamespace: Option[String] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    triggerOnPush: Option[Boolean] = None
  ): software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceActionProps =
    (new software.amazon.awscdk.services.codepipeline.actions.CodeStarConnectionsSourceActionProps.Builder)
      .connectionArn(connectionArn)
      .owner(owner)
      .repo(repo)
      .output(output)
      .codeBuildCloneOutput(codeBuildCloneOutput.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .role(role.orNull)
      .branch(branch.orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .triggerOnPush(triggerOnPush.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
