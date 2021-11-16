package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayPeeringAttachmentProps {

  def apply(
    peerRegion: String,
    transitGatewayId: String,
    peerAccountId: String,
    peerTransitGatewayId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    options: Option[software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment.TransitGatewayPeeringAttachmentOptionsProperty] = None
  ): software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachmentProps =
    (new software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachmentProps.Builder)
      .peerRegion(peerRegion)
      .transitGatewayId(transitGatewayId)
      .peerAccountId(peerAccountId)
      .peerTransitGatewayId(peerTransitGatewayId)
      .tags(tags.map(_.asJava).orNull)
      .options(options.orNull)
      .build()
}
