package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVPCPeeringConnectionProps {

  def apply(
    vpcId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    peerOwnerId: Option[String] = None,
    peerVpcId: Option[String] = None,
    peerRegion: Option[String] = None,
    peerRoleArn: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnVPCPeeringConnectionProps =
    (new software.amazon.awscdk.services.ec2.CfnVPCPeeringConnectionProps.Builder)
      .vpcId(vpcId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .peerOwnerId(peerOwnerId.orNull)
      .peerVpcId(peerVpcId.orNull)
      .peerRegion(peerRegion.orNull)
      .peerRoleArn(peerRoleArn.orNull)
      .build()
}
