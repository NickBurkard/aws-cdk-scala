package io.burkard.cdk.services.codepipeline

sealed abstract class GitHubTrigger(val underlying: software.amazon.awscdk.services.codepipeline.actions.GitHubTrigger)
  extends Product
    with Serializable

object GitHubTrigger {
  implicit def toAws(value: GitHubTrigger): software.amazon.awscdk.services.codepipeline.actions.GitHubTrigger =
    Option(value).map(_.underlying).orNull

  case object None
    extends GitHubTrigger(software.amazon.awscdk.services.codepipeline.actions.GitHubTrigger.NONE)

  case object Poll
    extends GitHubTrigger(software.amazon.awscdk.services.codepipeline.actions.GitHubTrigger.POLL)

  case object Webhook
    extends GitHubTrigger(software.amazon.awscdk.services.codepipeline.actions.GitHubTrigger.WEBHOOK)
}
