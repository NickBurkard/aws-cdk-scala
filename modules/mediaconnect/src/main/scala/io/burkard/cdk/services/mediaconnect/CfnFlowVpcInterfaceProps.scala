package io.burkard.cdk.services.mediaconnect

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFlowVpcInterfaceProps {

  def apply(
    name: Option[String] = None,
    securityGroupIds: Option[List[String]] = None,
    subnetId: Option[String] = None,
    roleArn: Option[String] = None,
    flowArn: Option[String] = None
  ): software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterfaceProps =
    (new software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterfaceProps.Builder)
      .name(name.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .subnetId(subnetId.orNull)
      .roleArn(roleArn.orNull)
      .flowArn(flowArn.orNull)
      .build()
}
