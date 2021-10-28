package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KinesisStream {

  def apply(
    stream: software.amazon.awscdk.services.kinesis.IStream,
    partitionKeyPath: Option[String] = None,
    message: Option[software.amazon.awscdk.services.events.RuleTargetInput] = None
  ): software.amazon.awscdk.services.events.targets.KinesisStream =
    software.amazon.awscdk.services.events.targets.KinesisStream.Builder
      .create(stream)
      .partitionKeyPath(partitionKeyPath.orNull)
      .message(message.orNull)
      .build()
}
