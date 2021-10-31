package io.burkard.cdk.services.kinesis

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
