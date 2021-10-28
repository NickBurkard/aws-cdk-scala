package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTransitGatewayConnectProps {

  def apply(
    options: Option[software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    transportTransitGatewayAttachmentId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnTransitGatewayConnectProps =
    (new software.amazon.awscdk.services.ec2.CfnTransitGatewayConnectProps.Builder)
      .options(options.orNull)
      .tags(tags.map(_.asJava).orNull)
      .transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId.orNull)
      .build()
}
