package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTransitGatewayPeeringAttachment {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    peerRegion: Option[String] = None,
    transitGatewayId: Option[String] = None,
    peerAccountId: Option[String] = None,
    peerTransitGatewayId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment =
    software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .peerRegion(peerRegion.orNull)
      .transitGatewayId(transitGatewayId.orNull)
      .peerAccountId(peerAccountId.orNull)
      .peerTransitGatewayId(peerTransitGatewayId.orNull)
      .build()
}
