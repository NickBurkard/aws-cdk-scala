package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSubnet {

  def apply(
    internalResourceId: String,
    vpcId: String,
    cidrBlock: String,
    assignIpv6AddressOnCreation: Option[Boolean] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    availabilityZone: Option[String] = None,
    outpostArn: Option[String] = None,
    ipv6CidrBlock: Option[String] = None,
    mapPublicIpOnLaunch: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnSubnet =
    software.amazon.awscdk.services.ec2.CfnSubnet.Builder
      .create(stackCtx, internalResourceId)
      .vpcId(vpcId)
      .cidrBlock(cidrBlock)
      .assignIpv6AddressOnCreation(assignIpv6AddressOnCreation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tags(tags.map(_.asJava).orNull)
      .availabilityZone(availabilityZone.orNull)
      .outpostArn(outpostArn.orNull)
      .ipv6CidrBlock(ipv6CidrBlock.orNull)
      .mapPublicIpOnLaunch(mapPublicIpOnLaunch.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
