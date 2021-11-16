package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayConnect {

  def apply(
    internalResourceId: String,
    options: software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty,
    transportTransitGatewayAttachmentId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect =
    software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.Builder
      .create(stackCtx, internalResourceId)
      .options(options)
      .transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
