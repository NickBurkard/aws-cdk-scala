package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IotTopicPublishProperty {

  def apply(
    payload: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty] = None,
    mqttTopic: Option[String] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotTopicPublishProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotTopicPublishProperty.Builder)
      .payload(payload.orNull)
      .mqttTopic(mqttTopic.orNull)
      .build()
}
