package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object IotEventsActionProperty {

  def apply(
    inputName: Option[String] = None,
    roleArn: Option[String] = None,
    messageId: Option[String] = None,
    batchMode: Option[Boolean] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.IotEventsActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.IotEventsActionProperty.Builder)
      .inputName(inputName.orNull)
      .roleArn(roleArn.orNull)
      .messageId(messageId.orNull)
      .batchMode(batchMode.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
