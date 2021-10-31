package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSubnet {

  def apply(
    internalResourceId: String,
    assignIpv6AddressOnCreation: Option[Boolean] = None,
    vpcId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    availabilityZone: Option[String] = None,
    cidrBlock: Option[String] = None,
    outpostArn: Option[String] = None,
    ipv6CidrBlock: Option[String] = None,
    mapPublicIpOnLaunch: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnSubnet =
    software.amazon.awscdk.services.ec2.CfnSubnet.Builder
      .create(stackCtx, internalResourceId)
      .assignIpv6AddressOnCreation(assignIpv6AddressOnCreation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpcId(vpcId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .availabilityZone(availabilityZone.orNull)
      .cidrBlock(cidrBlock.orNull)
      .outpostArn(outpostArn.orNull)
      .ipv6CidrBlock(ipv6CidrBlock.orNull)
      .mapPublicIpOnLaunch(mapPublicIpOnLaunch.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
