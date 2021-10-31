package io.burkard.cdk.services.mediaconnect

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFlowVpcInterface {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    securityGroupIds: Option[List[String]] = None,
    subnetId: Option[String] = None,
    roleArn: Option[String] = None,
    flowArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterface =
    software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterface.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .subnetId(subnetId.orNull)
      .roleArn(roleArn.orNull)
      .flowArn(flowArn.orNull)
      .build()
}
