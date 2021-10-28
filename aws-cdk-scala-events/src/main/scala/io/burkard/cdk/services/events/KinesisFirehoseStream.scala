package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KinesisFirehoseStream {

  def apply(
    stream: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream,
    message: Option[software.amazon.awscdk.services.events.RuleTargetInput] = None
  ): software.amazon.awscdk.services.events.targets.KinesisFirehoseStream =
    software.amazon.awscdk.services.events.targets.KinesisFirehoseStream.Builder
      .create(stream)
      .message(message.orNull)
      .build()
}
