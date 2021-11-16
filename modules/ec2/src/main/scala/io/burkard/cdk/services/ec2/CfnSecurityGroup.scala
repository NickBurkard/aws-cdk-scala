package io.burkard.cdk.services.ec2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSecurityGroup {

  def apply(
    internalResourceId: String,
    groupDescription: String,
    vpcId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    securityGroupIngress: Option[List[_]] = None,
    groupName: Option[String] = None,
    securityGroupEgress: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnSecurityGroup =
    software.amazon.awscdk.services.ec2.CfnSecurityGroup.Builder
      .create(stackCtx, internalResourceId)
      .groupDescription(groupDescription)
      .vpcId(vpcId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .securityGroupIngress(securityGroupIngress.map(_.asJava).orNull)
      .groupName(groupName.orNull)
      .securityGroupEgress(securityGroupEgress.map(_.asJava).orNull)
      .build()
}
