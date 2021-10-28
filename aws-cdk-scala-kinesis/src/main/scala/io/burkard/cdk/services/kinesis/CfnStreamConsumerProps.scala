package io.burkard.cdk.services.kinesis

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnStreamConsumerProps {

  def apply(
    consumerName: Option[String] = None,
    streamArn: Option[String] = None
  ): software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps =
    (new software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps.Builder)
      .consumerName(consumerName.orNull)
      .streamArn(streamArn.orNull)
      .build()
}
