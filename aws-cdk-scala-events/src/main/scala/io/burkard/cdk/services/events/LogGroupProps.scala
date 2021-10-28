package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LogGroupProps {

  def apply(
    maxEventAge: Option[software.amazon.awscdk.Duration] = None,
    event: Option[software.amazon.awscdk.services.events.RuleTargetInput] = None,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    retryAttempts: Option[Number] = None
  ): software.amazon.awscdk.services.events.targets.LogGroupProps =
    (new software.amazon.awscdk.services.events.targets.LogGroupProps.Builder)
      .maxEventAge(maxEventAge.orNull)
      .event(event.orNull)
      .deadLetterQueue(deadLetterQueue.orNull)
      .retryAttempts(retryAttempts.orNull)
      .build()
}
