package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GitHubSourceAction {

  def apply(
    owner: String,
    oauthToken: software.amazon.awscdk.SecretValue,
    repo: String,
    output: software.amazon.awscdk.services.codepipeline.Artifact,
    branch: Option[String] = None,
    runOrder: Option[Number] = None,
    actionName: Option[String] = None,
    trigger: Option[software.amazon.awscdk.services.codepipeline.actions.GitHubTrigger] = None,
    variablesNamespace: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.actions.GitHubSourceAction =
    software.amazon.awscdk.services.codepipeline.actions.GitHubSourceAction.Builder
      .create()
      .owner(owner)
      .oauthToken(oauthToken)
      .repo(repo)
      .output(output)
      .branch(branch.orNull)
      .runOrder(runOrder.orNull)
      .actionName(actionName.orNull)
      .trigger(trigger.orNull)
      .variablesNamespace(variablesNamespace.orNull)
      .build()
}
