package io.burkard.cdk.services.kinesis

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStreamConsumer {

  def apply(
    internalResourceId: String,
    consumerName: String,
    streamArn: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.kinesis.CfnStreamConsumer =
    software.amazon.awscdk.services.kinesis.CfnStreamConsumer.Builder
      .create(stackCtx, internalResourceId)
      .consumerName(consumerName)
      .streamArn(streamArn)
      .build()
}
