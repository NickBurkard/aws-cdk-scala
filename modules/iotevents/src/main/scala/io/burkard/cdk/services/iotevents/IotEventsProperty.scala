package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IotEventsProperty {

  def apply(
    payload: Option[software.amazon.awscdk.services.iotevents.CfnDetectorModel.PayloadProperty] = None,
    inputName: Option[String] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotEventsProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.IotEventsProperty.Builder)
      .payload(payload.orNull)
      .inputName(inputName.orNull)
      .build()
}
