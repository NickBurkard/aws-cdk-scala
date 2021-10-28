package io.burkard.cdk.services.codepipeline

sealed abstract class CodeCommitTrigger(val underlying: software.amazon.awscdk.services.codepipeline.actions.CodeCommitTrigger)
  extends Product
    with Serializable

object CodeCommitTrigger {
  implicit def toAws(value: CodeCommitTrigger): software.amazon.awscdk.services.codepipeline.actions.CodeCommitTrigger =
    Option(value).map(_.underlying).orNull

  case object None
    extends CodeCommitTrigger(software.amazon.awscdk.services.codepipeline.actions.CodeCommitTrigger.NONE)

  case object Poll
    extends CodeCommitTrigger(software.amazon.awscdk.services.codepipeline.actions.CodeCommitTrigger.POLL)

  case object Events
    extends CodeCommitTrigger(software.amazon.awscdk.services.codepipeline.actions.CodeCommitTrigger.EVENTS)
}
