package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTransitGatewayConnect {

  def apply(
    internalResourceId: String,
    options: Option[software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    transportTransitGatewayAttachmentId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect =
    software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.Builder
      .create(stackCtx, internalResourceId)
      .options(options.orNull)
      .tags(tags.map(_.asJava).orNull)
      .transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId.orNull)
      .build()
}
