package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSecurityGroupProps {

  def apply(
    vpcId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    securityGroupIngress: Option[List[_]] = None,
    groupDescription: Option[String] = None,
    groupName: Option[String] = None,
    securityGroupEgress: Option[List[_]] = None
  ): software.amazon.awscdk.services.ec2.CfnSecurityGroupProps =
    (new software.amazon.awscdk.services.ec2.CfnSecurityGroupProps.Builder)
      .vpcId(vpcId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .securityGroupIngress(securityGroupIngress.map(_.asJava).orNull)
      .groupDescription(groupDescription.orNull)
      .groupName(groupName.orNull)
      .securityGroupEgress(securityGroupEgress.map(_.asJava).orNull)
      .build()
}
