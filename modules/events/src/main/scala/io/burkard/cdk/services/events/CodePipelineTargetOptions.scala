package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CodePipelineTargetOptions {

  def apply(
    maxEventAge: Option[software.amazon.awscdk.Duration] = None,
    eventRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    retryAttempts: Option[Number] = None
  ): software.amazon.awscdk.services.events.targets.CodePipelineTargetOptions =
    (new software.amazon.awscdk.services.events.targets.CodePipelineTargetOptions.Builder)
      .maxEventAge(maxEventAge.orNull)
      .eventRole(eventRole.orNull)
      .deadLetterQueue(deadLetterQueue.orNull)
      .retryAttempts(retryAttempts.orNull)
      .build()
}
