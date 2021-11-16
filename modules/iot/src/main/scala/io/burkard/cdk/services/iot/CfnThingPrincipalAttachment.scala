package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnThingPrincipalAttachment {

  def apply(
    internalResourceId: String,
    thingName: String,
    principal: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment =
    software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment.Builder
      .create(stackCtx, internalResourceId)
      .thingName(thingName)
      .principal(principal)
      .build()
}
