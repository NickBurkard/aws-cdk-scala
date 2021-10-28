package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnThing {

  def apply(
    internalResourceId: String,
    attributePayload: Option[software.amazon.awscdk.services.iot.CfnThing.AttributePayloadProperty] = None,
    thingName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot.CfnThing =
    software.amazon.awscdk.services.iot.CfnThing.Builder
      .create(stackCtx, internalResourceId)
      .attributePayload(attributePayload.orNull)
      .thingName(thingName.orNull)
      .build()
}
