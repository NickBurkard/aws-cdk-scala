package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KinesisStreamProps {

  def apply(
    partitionKeyPath: Option[String] = None,
    message: Option[software.amazon.awscdk.services.events.RuleTargetInput] = None
  ): software.amazon.awscdk.services.events.targets.KinesisStreamProps =
    (new software.amazon.awscdk.services.events.targets.KinesisStreamProps.Builder)
      .partitionKeyPath(partitionKeyPath.orNull)
      .message(message.orNull)
      .build()
}
