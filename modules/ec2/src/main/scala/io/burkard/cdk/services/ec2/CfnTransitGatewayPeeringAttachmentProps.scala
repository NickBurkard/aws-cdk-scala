package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
