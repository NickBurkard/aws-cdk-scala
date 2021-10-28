package io.burkard.cdk.services.ec2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSecurityGroup {

  def apply(
    internalResourceId: String,
    vpcId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    securityGroupIngress: Option[List[_]] = None,
    groupDescription: Option[String] = None,
    groupName: Option[String] = None,
    securityGroupEgress: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnSecurityGroup =
    software.amazon.awscdk.services.ec2.CfnSecurityGroup.Builder
      .create(stackCtx, internalResourceId)
      .vpcId(vpcId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .securityGroupIngress(securityGroupIngress.map(_.asJava).orNull)
      .groupDescription(groupDescription.orNull)
      .groupName(groupName.orNull)
      .securityGroupEgress(securityGroupEgress.map(_.asJava).orNull)
      .build()
}