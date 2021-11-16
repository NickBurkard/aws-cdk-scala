package io.burkard.cdk.services.kinesis

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStreamConsumerProps {

  def apply(
    consumerName: String,
    streamArn: String
  ): software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps =
    (new software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps.Builder)
      .consumerName(consumerName)
      .streamArn(streamArn)
      .build()
}
