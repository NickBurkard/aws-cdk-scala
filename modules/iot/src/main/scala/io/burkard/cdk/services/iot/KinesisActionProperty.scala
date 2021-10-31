package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KinesisActionProperty {

  def apply(
    partitionKey: Option[String] = None,
    roleArn: Option[String] = None,
    streamName: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.KinesisActionProperty.Builder)
      .partitionKey(partitionKey.orNull)
      .roleArn(roleArn.orNull)
      .streamName(streamName.orNull)
      .build()
}
