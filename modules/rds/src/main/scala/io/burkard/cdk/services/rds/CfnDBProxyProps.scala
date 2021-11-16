package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDBProxyProps {

  def apply(
    auth: List[_],
    vpcSubnetIds: List[String],
    engineFamily: String,
    roleArn: String,
    dbProxyName: String,
    vpcSecurityGroupIds: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.rds.CfnDBProxy.TagFormatProperty]] = None,
    debugLogging: Option[Boolean] = None,
    requireTls: Option[Boolean] = None,
    idleClientTimeout: Option[Number] = None
  ): software.amazon.awscdk.services.rds.CfnDBProxyProps =
    (new software.amazon.awscdk.services.rds.CfnDBProxyProps.Builder)
      .auth(auth.asJava)
      .vpcSubnetIds(vpcSubnetIds.asJava)
      .engineFamily(engineFamily)
      .roleArn(roleArn)
      .dbProxyName(dbProxyName)
      .vpcSecurityGroupIds(vpcSecurityGroupIds.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .debugLogging(debugLogging.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .requireTls(requireTls.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .idleClientTimeout(idleClientTimeout.orNull)
      .build()
}
