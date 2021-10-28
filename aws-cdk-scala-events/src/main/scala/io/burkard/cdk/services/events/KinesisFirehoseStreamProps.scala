package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KinesisFirehoseStreamProps {

  def apply(
    message: Option[software.amazon.awscdk.services.events.RuleTargetInput] = None
  ): software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamProps =
    (new software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamProps.Builder)
      .message(message.orNull)
      .build()
}
