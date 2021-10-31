package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVPCPeeringConnection {

  def apply(
    internalResourceId: String,
    vpcId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    peerOwnerId: Option[String] = None,
    peerVpcId: Option[String] = None,
    peerRegion: Option[String] = None,
    peerRoleArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnVPCPeeringConnection =
    software.amazon.awscdk.services.ec2.CfnVPCPeeringConnection.Builder
      .create(stackCtx, internalResourceId)
      .vpcId(vpcId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .peerOwnerId(peerOwnerId.orNull)
      .peerVpcId(peerVpcId.orNull)
      .peerRegion(peerRegion.orNull)
      .peerRoleArn(peerRoleArn.orNull)
      .build()
}
