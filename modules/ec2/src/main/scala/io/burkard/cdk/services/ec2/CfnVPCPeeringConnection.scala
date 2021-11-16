package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVPCPeeringConnection {

  def apply(
    internalResourceId: String,
    vpcId: String,
    peerVpcId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    peerOwnerId: Option[String] = None,
    peerRegion: Option[String] = None,
    peerRoleArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnVPCPeeringConnection =
    software.amazon.awscdk.services.ec2.CfnVPCPeeringConnection.Builder
      .create(stackCtx, internalResourceId)
      .vpcId(vpcId)
      .peerVpcId(peerVpcId)
      .tags(tags.map(_.asJava).orNull)
      .peerOwnerId(peerOwnerId.orNull)
      .peerRegion(peerRegion.orNull)
      .peerRoleArn(peerRoleArn.orNull)
      .build()
}
