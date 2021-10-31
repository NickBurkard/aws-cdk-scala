package io.burkard.cdk.pipelines

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GitHubSourceOptions {

  def apply(
    authentication: Option[software.amazon.awscdk.SecretValue] = None,
    trigger: Option[software.amazon.awscdk.services.codepipeline.actions.GitHubTrigger] = None
  ): software.amazon.awscdk.pipelines.GitHubSourceOptions =
    (new software.amazon.awscdk.pipelines.GitHubSourceOptions.Builder)
      .authentication(authentication.orNull)
      .trigger(trigger.orNull)
      .build()
}
