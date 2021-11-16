package io.burkard.cdk.services.mediaconnect

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFlowVpcInterfaceProps {

  def apply(
    name: String,
    securityGroupIds: List[String],
    subnetId: String,
    roleArn: String,
    flowArn: String
  ): software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterfaceProps =
    (new software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterfaceProps.Builder)
      .name(name)
      .securityGroupIds(securityGroupIds.asJava)
      .subnetId(subnetId)
      .roleArn(roleArn)
      .flowArn(flowArn)
      .build()
}
