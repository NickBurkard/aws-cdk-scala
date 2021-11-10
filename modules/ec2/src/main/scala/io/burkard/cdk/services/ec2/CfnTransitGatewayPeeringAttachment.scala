package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayPeeringAttachment {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    options: Option[software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment.TransitGatewayPeeringAttachmentOptionsProperty] = None,
    peerRegion: Option[String] = None,
    transitGatewayId: Option[String] = None,
    peerAccountId: Option[String] = None,
    peerTransitGatewayId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment =
    software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .options(options.orNull)
      .peerRegion(peerRegion.orNull)
      .transitGatewayId(transitGatewayId.orNull)
      .peerAccountId(peerAccountId.orNull)
      .peerTransitGatewayId(peerTransitGatewayId.orNull)
      .build()
}
