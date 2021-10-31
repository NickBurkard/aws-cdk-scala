package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTransitGatewayVpcAttachment {

  def apply(
    internalResourceId: String,
    subnetIds: Option[List[String]] = None,
    removeSubnetIds: Option[List[String]] = None,
    vpcId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    options: Option[AnyRef] = None,
    transitGatewayId: Option[String] = None,
    addSubnetIds: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment =
    software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment.Builder
      .create(stackCtx, internalResourceId)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .removeSubnetIds(removeSubnetIds.map(_.asJava).orNull)
      .vpcId(vpcId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .options(options.orNull)
      .transitGatewayId(transitGatewayId.orNull)
      .addSubnetIds(addSubnetIds.map(_.asJava).orNull)
      .build()
}
