package io.burkard.cdk.services.codecommit

sealed abstract class RepositoryNotificationEvents(val underlying: software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents)
  extends Product
    with Serializable

object RepositoryNotificationEvents {
  implicit def toAws(value: RepositoryNotificationEvents): software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents =
    Option(value).map(_.underlying).orNull

  case object CommitComment
    extends RepositoryNotificationEvents(software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.COMMIT_COMMENT)

  case object PullRequestComment
    extends RepositoryNotificationEvents(software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.PULL_REQUEST_COMMENT)

  case object ApprovalStatusChanged
    extends RepositoryNotificationEvents(software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.APPROVAL_STATUS_CHANGED)

  case object ApprovalRuleOverridden
    extends RepositoryNotificationEvents(software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.APPROVAL_RULE_OVERRIDDEN)

  case object PullRequestCreated
    extends RepositoryNotificationEvents(software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.PULL_REQUEST_CREATED)

  case object PullRequestSourceUpdated
    extends RepositoryNotificationEvents(software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.PULL_REQUEST_SOURCE_UPDATED)

  case object PullRequestStatusChanged
    extends RepositoryNotificationEvents(software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.PULL_REQUEST_STATUS_CHANGED)

  case object PullRequestMerged
    extends RepositoryNotificationEvents(software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.PULL_REQUEST_MERGED)

  case object BranchOrTagCreated
    extends RepositoryNotificationEvents(software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.BRANCH_OR_TAG_CREATED)

  case object BranchOrTagDeleted
    extends RepositoryNotificationEvents(software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.BRANCH_OR_TAG_DELETED)

  case object BranchOrTagUpdated
    extends RepositoryNotificationEvents(software.amazon.awscdk.services.codecommit.RepositoryNotificationEvents.BRANCH_OR_TAG_UPDATED)
}
