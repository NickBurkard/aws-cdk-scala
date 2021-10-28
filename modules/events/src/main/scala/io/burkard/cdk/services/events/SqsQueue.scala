package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SqsQueue {

  def apply(
    queue: software.amazon.awscdk.services.sqs.IQueue,
    messageGroupId: Option[String] = None,
    message: Option[software.amazon.awscdk.services.events.RuleTargetInput] = None
  ): software.amazon.awscdk.services.events.targets.SqsQueue =
    software.amazon.awscdk.services.events.targets.SqsQueue.Builder
      .create(queue)
      .messageGroupId(messageGroupId.orNull)
      .message(message.orNull)
      .build()
}
