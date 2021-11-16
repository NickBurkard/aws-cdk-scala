package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayPeeringAttachment {

  def apply(
    internalResourceId: String,
    peerRegion: String,
    transitGatewayId: String,
    peerAccountId: String,
    peerTransitGatewayId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    options: Option[software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment.TransitGatewayPeeringAttachmentOptionsProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment =
    software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment.Builder
      .create(stackCtx, internalResourceId)
      .peerRegion(peerRegion)
      .transitGatewayId(transitGatewayId)
      .peerAccountId(peerAccountId)
      .peerTransitGatewayId(peerTransitGatewayId)
      .tags(tags.map(_.asJava).orNull)
      .options(options.orNull)
      .build()
}
