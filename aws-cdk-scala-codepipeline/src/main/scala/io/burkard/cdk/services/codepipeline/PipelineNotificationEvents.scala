package io.burkard.cdk.services.codepipeline

sealed abstract class PipelineNotificationEvents(val underlying: software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents)
  extends Product
    with Serializable

object PipelineNotificationEvents {
  implicit def toAws(value: PipelineNotificationEvents): software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents =
    Option(value).map(_.underlying).orNull

  case object PipelineExecutionFailed
    extends PipelineNotificationEvents(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.PIPELINE_EXECUTION_FAILED)

  case object PipelineExecutionCanceled
    extends PipelineNotificationEvents(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.PIPELINE_EXECUTION_CANCELED)

  case object PipelineExecutionStarted
    extends PipelineNotificationEvents(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.PIPELINE_EXECUTION_STARTED)

  case object PipelineExecutionResumed
    extends PipelineNotificationEvents(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.PIPELINE_EXECUTION_RESUMED)

  case object PipelineExecutionSucceeded
    extends PipelineNotificationEvents(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.PIPELINE_EXECUTION_SUCCEEDED)

  case object PipelineExecutionSuperseded
    extends PipelineNotificationEvents(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.PIPELINE_EXECUTION_SUPERSEDED)

  case object StageExecutionStarted
    extends PipelineNotificationEvents(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.STAGE_EXECUTION_STARTED)

  case object StageExecutionSucceeded
    extends PipelineNotificationEvents(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.STAGE_EXECUTION_SUCCEEDED)

  case object StageExecutionResumed
    extends PipelineNotificationEvents(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.STAGE_EXECUTION_RESUMED)

  case object StageExecutionCanceled
    extends PipelineNotificationEvents(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.STAGE_EXECUTION_CANCELED)

  case object StageExecutionFailed
    extends PipelineNotificationEvents(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.STAGE_EXECUTION_FAILED)

  case object ActionExecutionSucceeded
    extends PipelineNotificationEvents(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.ACTION_EXECUTION_SUCCEEDED)

  case object ActionExecutionFailed
    extends PipelineNotificationEvents(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.ACTION_EXECUTION_FAILED)

  case object ActionExecutionCanceled
    extends PipelineNotificationEvents(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.ACTION_EXECUTION_CANCELED)

  case object ActionExecutionStarted
    extends PipelineNotificationEvents(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.ACTION_EXECUTION_STARTED)

  case object ManualApprovalFailed
    extends PipelineNotificationEvents(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.MANUAL_APPROVAL_FAILED)

  case object ManualApprovalNeeded
    extends PipelineNotificationEvents(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.MANUAL_APPROVAL_NEEDED)

  case object ManualApprovalSucceeded
    extends PipelineNotificationEvents(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.MANUAL_APPROVAL_SUCCEEDED)
}
