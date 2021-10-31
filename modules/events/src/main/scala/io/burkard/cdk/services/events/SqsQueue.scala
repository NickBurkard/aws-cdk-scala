package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SqsQueue {

  def apply(
    queue: software.amazon.awscdk.services.sqs.IQueue,
    maxEventAge: Option[software.amazon.awscdk.Duration] = None,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    messageGroupId: Option[String] = None,
    message: Option[software.amazon.awscdk.services.events.RuleTargetInput] = None,
    retryAttempts: Option[Number] = None
  ): software.amazon.awscdk.services.events.targets.SqsQueue =
    software.amazon.awscdk.services.events.targets.SqsQueue.Builder
      .create(queue)
      .maxEventAge(maxEventAge.orNull)
      .deadLetterQueue(deadLetterQueue.orNull)
      .messageGroupId(messageGroupId.orNull)
      .message(message.orNull)
      .retryAttempts(retryAttempts.orNull)
      .build()
}
