package io.burkard.cdk.services.mediaconnect

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFlowVpcInterface {

  def apply(
    internalResourceId: String,
    name: String,
    securityGroupIds: List[String],
    subnetId: String,
    roleArn: String,
    flowArn: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterface =
    software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterface.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .securityGroupIds(securityGroupIds.asJava)
      .subnetId(subnetId)
      .roleArn(roleArn)
      .flowArn(flowArn)
      .build()
}
