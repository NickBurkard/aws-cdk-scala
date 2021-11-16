package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDBProxyEndpointProps {

  def apply(
    vpcSubnetIds: List[String],
    dbProxyEndpointName: String,
    dbProxyName: String,
    vpcSecurityGroupIds: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.rds.CfnDBProxyEndpoint.TagFormatProperty]] = None,
    targetRole: Option[String] = None
  ): software.amazon.awscdk.services.rds.CfnDBProxyEndpointProps =
    (new software.amazon.awscdk.services.rds.CfnDBProxyEndpointProps.Builder)
      .vpcSubnetIds(vpcSubnetIds.asJava)
      .dbProxyEndpointName(dbProxyEndpointName)
      .dbProxyName(dbProxyName)
      .vpcSecurityGroupIds(vpcSecurityGroupIds.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .targetRole(targetRole.orNull)
      .build()
}
