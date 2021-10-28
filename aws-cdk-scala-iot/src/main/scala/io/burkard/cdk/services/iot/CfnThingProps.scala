package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnThingProps {

  def apply(
    attributePayload: Option[software.amazon.awscdk.services.iot.CfnThing.AttributePayloadProperty] = None,
    thingName: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnThingProps =
    (new software.amazon.awscdk.services.iot.CfnThingProps.Builder)
      .attributePayload(attributePayload.orNull)
      .thingName(thingName.orNull)
      .build()
}
