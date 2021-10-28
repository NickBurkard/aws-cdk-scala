package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CodeBuildProject {

  def apply(
    project: software.amazon.awscdk.services.codebuild.IProject,
    maxEventAge: Option[software.amazon.awscdk.Duration] = None,
    eventRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    event: Option[software.amazon.awscdk.services.events.RuleTargetInput] = None,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    retryAttempts: Option[Number] = None
  ): software.amazon.awscdk.services.events.targets.CodeBuildProject =
    software.amazon.awscdk.services.events.targets.CodeBuildProject.Builder
      .create(project)
      .maxEventAge(maxEventAge.orNull)
      .eventRole(eventRole.orNull)
      .event(event.orNull)
      .deadLetterQueue(deadLetterQueue.orNull)
      .retryAttempts(retryAttempts.orNull)
      .build()
}
