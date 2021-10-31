package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
