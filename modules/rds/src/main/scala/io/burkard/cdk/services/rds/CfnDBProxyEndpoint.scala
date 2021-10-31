package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDBProxyEndpoint {

  def apply(
    internalResourceId: String,
    vpcSecurityGroupIds: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.rds.CfnDBProxyEndpoint.TagFormatProperty]] = None,
    vpcSubnetIds: Option[List[String]] = None,
    dbProxyEndpointName: Option[String] = None,
    targetRole: Option[String] = None,
    dbProxyName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.rds.CfnDBProxyEndpoint =
    software.amazon.awscdk.services.rds.CfnDBProxyEndpoint.Builder
      .create(stackCtx, internalResourceId)
      .vpcSecurityGroupIds(vpcSecurityGroupIds.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .vpcSubnetIds(vpcSubnetIds.map(_.asJava).orNull)
      .dbProxyEndpointName(dbProxyEndpointName.orNull)
      .targetRole(targetRole.orNull)
      .dbProxyName(dbProxyName.orNull)
      .build()
}
