package io.burkard.cdk.services.codebuild


sealed abstract class EventAction(val underlying: software.amazon.awscdk.services.codebuild.EventAction)
  extends Product
    with Serializable


object EventAction {
  implicit def toAws(value: EventAction): software.amazon.awscdk.services.codebuild.EventAction =
    Option(value).map(_.underlying).orNull

  case object Push
    extends EventAction(software.amazon.awscdk.services.codebuild.EventAction.PUSH)

  case object PullRequestCreated
    extends EventAction(software.amazon.awscdk.services.codebuild.EventAction.PULL_REQUEST_CREATED)

  case object PullRequestUpdated
    extends EventAction(software.amazon.awscdk.services.codebuild.EventAction.PULL_REQUEST_UPDATED)

  case object PullRequestMerged
    extends EventAction(software.amazon.awscdk.services.codebuild.EventAction.PULL_REQUEST_MERGED)

  case object PullRequestReopened
    extends EventAction(software.amazon.awscdk.services.codebuild.EventAction.PULL_REQUEST_REOPENED)
}
