package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnThingPrincipalAttachmentProps {

  def apply(
    thingName: String,
    principal: String
  ): software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps =
    (new software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps.Builder)
      .thingName(thingName)
      .principal(principal)
      .build()
}
