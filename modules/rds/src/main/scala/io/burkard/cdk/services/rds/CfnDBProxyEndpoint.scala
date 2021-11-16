package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDBProxyEndpoint {

  def apply(
    internalResourceId: String,
    vpcSubnetIds: List[String],
    dbProxyEndpointName: String,
    dbProxyName: String,
    vpcSecurityGroupIds: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.rds.CfnDBProxyEndpoint.TagFormatProperty]] = None,
    targetRole: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.rds.CfnDBProxyEndpoint =
    software.amazon.awscdk.services.rds.CfnDBProxyEndpoint.Builder
      .create(stackCtx, internalResourceId)
      .vpcSubnetIds(vpcSubnetIds.asJava)
      .dbProxyEndpointName(dbProxyEndpointName)
      .dbProxyName(dbProxyName)
      .vpcSecurityGroupIds(vpcSecurityGroupIds.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .targetRole(targetRole.orNull)
      .build()
}
