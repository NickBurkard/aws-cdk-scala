package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GitHubSourceAction {

  def apply(
    branch: Option[String] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    owner: Option[String] = None,
    trigger: Option[software.amazon.awscdk.services.codepipeline.actions.GitHubTrigger] = None,
    oauthToken: Option[software.amazon.awscdk.SecretValue] = None,
    variablesNamespace: Option[String] = None,
    repo: Option[String] = None,
    output: Option[software.amazon.awscdk.services.codepipeline.Artifact] = None
  ): software.amazon.awscdk.services.codepipeline.actions.GitHubSourceAction =
    software.amazon.awscdk.services.codepipeline.actions.GitHubSourceAction.Builder
      .create()
      .branch(branch.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .owner(owner.orNull)
      .trigger(trigger.orNull)
      .oauthToken(oauthToken.orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .repo(repo.orNull)
      .output(output.orNull)
      .build()
}
