package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IotTopicPublishProperty {

  def apply(
    mqttTopic: String,
    payload: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotTopicPublishProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotTopicPublishProperty.Builder)
      .mqttTopic(mqttTopic)
      .payload(payload.orNull)
      .build()
}
