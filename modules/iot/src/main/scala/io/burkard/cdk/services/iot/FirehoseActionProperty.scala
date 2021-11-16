package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FirehoseActionProperty {

  def apply(
    roleArn: String,
    deliveryStreamName: String,
    separator: Option[String] = None,
    batchMode: Option[Boolean] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty.Builder)
      .roleArn(roleArn)
      .deliveryStreamName(deliveryStreamName)
      .separator(separator.orNull)
      .batchMode(batchMode.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
