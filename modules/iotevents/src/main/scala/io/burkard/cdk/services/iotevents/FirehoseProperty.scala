package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FirehoseProperty {

  def apply(
    deliveryStreamName: String,
    payload: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty] = None,
    separator: Option[String] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.FirehoseProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.FirehoseProperty.Builder)
      .deliveryStreamName(deliveryStreamName)
      .payload(payload.orNull)
      .separator(separator.orNull)
      .build()
}
