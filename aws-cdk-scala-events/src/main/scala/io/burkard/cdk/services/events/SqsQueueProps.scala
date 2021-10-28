package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SqsQueueProps {

  def apply(
    messageGroupId: Option[String] = None,
    message: Option[software.amazon.awscdk.services.events.RuleTargetInput] = None
  ): software.amazon.awscdk.services.events.targets.SqsQueueProps =
    (new software.amazon.awscdk.services.events.targets.SqsQueueProps.Builder)
      .messageGroupId(messageGroupId.orNull)
      .message(message.orNull)
      .build()
}
