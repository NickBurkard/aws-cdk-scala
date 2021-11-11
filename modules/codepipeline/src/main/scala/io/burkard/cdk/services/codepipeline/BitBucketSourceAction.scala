package io.burkard.cdk.services.codepipeline

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BitBucketSourceAction {

  def apply(
    codeBuildCloneOutput: Option[Boolean] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    branch: Option[String] = None,
    connectionArn: Option[String] = None,
    variablesNamespace: Option[String] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    owner: Option[String] = None,
    triggerOnPush: Option[Boolean] = None,
    repo: Option[String] = None,
    output: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None
  ): software.amazon.awscdk.services.codepipeline.actions.BitBucketSourceAction =
    software.amazon.awscdk.services.codepipeline.actions.BitBucketSourceAction.Builder
      .create()
      .codeBuildCloneOutput(codeBuildCloneOutput.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .role(role.orNull)
      .branch(branch.orNull)
      .connectionArn(connectionArn.orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .owner(owner.orNull)
      .triggerOnPush(triggerOnPush.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .repo(repo.orNull)
      .output(output.orNull)
      .build()
}
