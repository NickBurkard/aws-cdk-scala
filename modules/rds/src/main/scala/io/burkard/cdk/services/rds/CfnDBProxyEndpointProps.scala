package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDBProxyEndpointProps {

  def apply(
    vpcSecurityGroupIds: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.rds.CfnDBProxyEndpoint.TagFormatProperty]] = None,
    vpcSubnetIds: Option[List[String]] = None,
    dbProxyEndpointName: Option[String] = None,
    targetRole: Option[String] = None,
    dbProxyName: Option[String] = None
  ): software.amazon.awscdk.services.rds.CfnDBProxyEndpointProps =
    (new software.amazon.awscdk.services.rds.CfnDBProxyEndpointProps.Builder)
      .vpcSecurityGroupIds(vpcSecurityGroupIds.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .vpcSubnetIds(vpcSubnetIds.map(_.asJava).orNull)
      .dbProxyEndpointName(dbProxyEndpointName.orNull)
      .targetRole(targetRole.orNull)
      .dbProxyName(dbProxyName.orNull)
      .build()
}
