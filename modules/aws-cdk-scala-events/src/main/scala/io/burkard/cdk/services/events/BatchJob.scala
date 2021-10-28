package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BatchJob {

  def apply(
    jobQueueArn: String,
    jobQueueScope: software.constructs.IConstruct,
    jobDefinitionArn: String,
    jobDefinitionScope: software.constructs.IConstruct,
    jobName: Option[String] = None,
    size: Option[Number] = None,
    event: Option[software.amazon.awscdk.services.events.RuleTargetInput] = None,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    retryAttempts: Option[Number] = None,
    attempts: Option[Number] = None,
    maxEventAge: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.events.targets.BatchJob =
    software.amazon.awscdk.services.events.targets.BatchJob.Builder
      .create(jobQueueArn, jobQueueScope, jobDefinitionArn, jobDefinitionScope)
      .jobName(jobName.orNull)
      .size(size.orNull)
      .event(event.orNull)
      .deadLetterQueue(deadLetterQueue.orNull)
      .retryAttempts(retryAttempts.orNull)
      .attempts(attempts.orNull)
      .maxEventAge(maxEventAge.orNull)
      .build()
}
