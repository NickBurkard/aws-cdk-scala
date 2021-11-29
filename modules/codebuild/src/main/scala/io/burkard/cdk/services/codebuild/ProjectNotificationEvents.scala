package io.burkard.cdk.services.codebuild

sealed abstract class ProjectNotificationEvents(val underlying: software.amazon.awscdk.services.codebuild.ProjectNotificationEvents)
  extends Product
    with Serializable

object ProjectNotificationEvents {
  implicit def toAws(value: ProjectNotificationEvents): software.amazon.awscdk.services.codebuild.ProjectNotificationEvents =
    Option(value).map(_.underlying).orNull

  case object BuildFailed
    extends ProjectNotificationEvents(software.amazon.awscdk.services.codebuild.ProjectNotificationEvents.BUILD_FAILED)

  case object BuildInProgress
    extends ProjectNotificationEvents(software.amazon.awscdk.services.codebuild.ProjectNotificationEvents.BUILD_IN_PROGRESS)

  case object BuildPhaseFailed
    extends ProjectNotificationEvents(software.amazon.awscdk.services.codebuild.ProjectNotificationEvents.BUILD_PHASE_FAILED)

  case object BuildPhaseSucceeded
    extends ProjectNotificationEvents(software.amazon.awscdk.services.codebuild.ProjectNotificationEvents.BUILD_PHASE_SUCCEEDED)

  case object BuildStopped
    extends ProjectNotificationEvents(software.amazon.awscdk.services.codebuild.ProjectNotificationEvents.BUILD_STOPPED)

  case object BuildSucceeded
    extends ProjectNotificationEvents(software.amazon.awscdk.services.codebuild.ProjectNotificationEvents.BUILD_SUCCEEDED)
}
