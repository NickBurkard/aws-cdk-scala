package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayAttachmentProps {

  def apply(
    subnetIds: List[String],
    vpcId: String,
    transitGatewayId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachmentProps =
    (new software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachmentProps.Builder)
      .subnetIds(subnetIds.asJava)
      .vpcId(vpcId)
      .transitGatewayId(transitGatewayId)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
