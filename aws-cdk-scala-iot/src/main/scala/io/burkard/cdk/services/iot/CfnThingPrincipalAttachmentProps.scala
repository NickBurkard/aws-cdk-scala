package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnThingPrincipalAttachmentProps {

  def apply(
    thingName: Option[String] = None,
    principal: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps =
    (new software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps.Builder)
      .thingName(thingName.orNull)
      .principal(principal.orNull)
      .build()
}
