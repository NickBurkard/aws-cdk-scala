package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SqsQueueProps {

  def apply(
    maxEventAge: Option[software.amazon.awscdk.Duration] = None,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    messageGroupId: Option[String] = None,
    message: Option[software.amazon.awscdk.services.events.RuleTargetInput] = None,
    retryAttempts: Option[Number] = None
  ): software.amazon.awscdk.services.events.targets.SqsQueueProps =
    (new software.amazon.awscdk.services.events.targets.SqsQueueProps.Builder)
      .maxEventAge(maxEventAge.orNull)
      .deadLetterQueue(deadLetterQueue.orNull)
      .messageGroupId(messageGroupId.orNull)
      .message(message.orNull)
      .retryAttempts(retryAttempts.orNull)
      .build()
}
