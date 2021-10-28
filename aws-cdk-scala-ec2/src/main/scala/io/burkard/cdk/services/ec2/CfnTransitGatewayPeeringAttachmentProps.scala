package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTransitGatewayPeeringAttachmentProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    peerRegion: Option[String] = None,
    transitGatewayId: Option[String] = None,
    peerAccountId: Option[String] = None,
    peerTransitGatewayId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachmentProps =
    (new software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachmentProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .peerRegion(peerRegion.orNull)
      .transitGatewayId(transitGatewayId.orNull)
      .peerAccountId(peerAccountId.orNull)
      .peerTransitGatewayId(peerTransitGatewayId.orNull)
      .build()
}
