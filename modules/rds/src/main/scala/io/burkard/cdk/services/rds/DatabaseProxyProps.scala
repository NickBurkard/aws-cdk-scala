package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatabaseProxyProps {

  def apply(
    proxyTarget: software.amazon.awscdk.services.rds.ProxyTarget,
    iamAuth: Option[Boolean] = None,
    maxConnectionsPercent: Option[Number] = None,
    maxIdleConnectionsPercent: Option[Number] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    requireTls: Option[Boolean] = None,
    secrets: Option[List[_ <: software.amazon.awscdk.services.secretsmanager.ISecret]] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    sessionPinningFilters: Option[List[_ <: software.amazon.awscdk.services.rds.SessionPinningFilter]] = None,
    initQuery: Option[String] = None,
    debugLogging: Option[Boolean] = None,
    borrowTimeout: Option[software.amazon.awscdk.Duration] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    dbProxyName: Option[String] = None,
    idleClientTimeout: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.rds.DatabaseProxyProps =
    (new software.amazon.awscdk.services.rds.DatabaseProxyProps.Builder)
      .proxyTarget(proxyTarget)
      .iamAuth(iamAuth.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .maxConnectionsPercent(maxConnectionsPercent.orNull)
      .maxIdleConnectionsPercent(maxIdleConnectionsPercent.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .requireTls(requireTls.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .secrets(secrets.map(_.asJava).orNull)
      .role(role.orNull)
      .sessionPinningFilters(sessionPinningFilters.map(_.asJava).orNull)
      .initQuery(initQuery.orNull)
      .debugLogging(debugLogging.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .borrowTimeout(borrowTimeout.orNull)
      .vpc(vpc.orNull)
      .dbProxyName(dbProxyName.orNull)
      .idleClientTimeout(idleClientTimeout.orNull)
      .build()
}
