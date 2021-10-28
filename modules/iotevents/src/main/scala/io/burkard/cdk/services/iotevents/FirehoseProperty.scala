package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FirehoseProperty {

  def apply(
    payload: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty] = None,
    separator: Option[String] = None,
    deliveryStreamName: Option[String] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.FirehoseProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.FirehoseProperty.Builder)
      .payload(payload.orNull)
      .separator(separator.orNull)
      .deliveryStreamName(deliveryStreamName.orNull)
      .build()
}
