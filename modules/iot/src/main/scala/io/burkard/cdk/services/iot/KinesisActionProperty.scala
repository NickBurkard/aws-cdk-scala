package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KinesisActionProperty {

  def apply(
    roleArn: String,
    streamName: String,
    partitionKey: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty.Builder)
      .roleArn(roleArn)
      .streamName(streamName)
      .partitionKey(partitionKey.orNull)
      .build()
}
