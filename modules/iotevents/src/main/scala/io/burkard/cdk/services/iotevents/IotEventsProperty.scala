package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IotEventsProperty {

  def apply(
    inputName: String,
    payload: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotEventsProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotEventsProperty.Builder)
      .inputName(inputName)
      .payload(payload.orNull)
      .build()
}
