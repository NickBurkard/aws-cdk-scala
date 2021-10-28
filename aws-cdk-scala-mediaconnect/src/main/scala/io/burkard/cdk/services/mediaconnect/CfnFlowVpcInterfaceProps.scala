package io.burkard.cdk.services.mediaconnect

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
