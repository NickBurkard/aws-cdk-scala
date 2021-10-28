package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FirehoseActionProperty {

  def apply(
    separator: Option[String] = None,
    roleArn: Option[String] = None,
    deliveryStreamName: Option[String] = None,
    batchMode: Option[Boolean] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.FirehoseActionProperty.Builder)
      .separator(separator.orNull)
      .roleArn(roleArn.orNull)
      .deliveryStreamName(deliveryStreamName.orNull)
      .batchMode(batchMode.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
