package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnThingPrincipalAttachment {

  def apply(
    internalResourceId: String,
    thingName: Option[String] = None,
    principal: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment =
    software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment.Builder
      .create(stackCtx, internalResourceId)
      .thingName(thingName.orNull)
      .principal(principal.orNull)
      .build()
}
