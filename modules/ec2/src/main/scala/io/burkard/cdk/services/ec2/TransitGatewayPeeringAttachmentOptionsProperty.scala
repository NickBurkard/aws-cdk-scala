package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TransitGatewayPeeringAttachmentOptionsProperty {

  def apply(
    dynamicRouting: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment.TransitGatewayPeeringAttachmentOptionsProperty =
    (new software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment.TransitGatewayPeeringAttachmentOptionsProperty.Builder)
      .dynamicRouting(dynamicRouting.orNull)
      .build()
}
