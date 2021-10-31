package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTransitGatewayAttachmentProps {

  def apply(
    subnetIds: Option[List[String]] = None,
    vpcId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    transitGatewayId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachmentProps =
    (new software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachmentProps.Builder)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .vpcId(vpcId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .transitGatewayId(transitGatewayId.orNull)
      .build()
}
