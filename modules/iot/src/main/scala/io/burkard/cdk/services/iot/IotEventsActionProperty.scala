package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IotEventsActionProperty {

  def apply(
    inputName: String,
    roleArn: String,
    messageId: Option[String] = None,
    batchMode: Option[Boolean] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.IotEventsActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.IotEventsActionProperty.Builder)
      .inputName(inputName)
      .roleArn(roleArn)
      .messageId(messageId.orNull)
      .batchMode(batchMode.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
