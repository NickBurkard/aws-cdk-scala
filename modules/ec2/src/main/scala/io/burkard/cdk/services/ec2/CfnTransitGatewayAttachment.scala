package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayAttachment {

  def apply(
    internalResourceId: String,
    subnetIds: List[String],
    vpcId: String,
    transitGatewayId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment =
    software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment.Builder
      .create(stackCtx, internalResourceId)
      .subnetIds(subnetIds.asJava)
      .vpcId(vpcId)
      .transitGatewayId(transitGatewayId)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
