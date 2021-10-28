package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CloudWatchLogGroup {

  def apply(
    logGroup: software.amazon.awscdk.services.logs.ILogGroup,
    maxEventAge: Option[software.amazon.awscdk.Duration] = None,
    event: Option[software.amazon.awscdk.services.events.RuleTargetInput] = None,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    retryAttempts: Option[Number] = None
  ): software.amazon.awscdk.services.events.targets.CloudWatchLogGroup =
    software.amazon.awscdk.services.events.targets.CloudWatchLogGroup.Builder
      .create(logGroup)
      .maxEventAge(maxEventAge.orNull)
      .event(event.orNull)
      .deadLetterQueue(deadLetterQueue.orNull)
      .retryAttempts(retryAttempts.orNull)
      .build()
}
