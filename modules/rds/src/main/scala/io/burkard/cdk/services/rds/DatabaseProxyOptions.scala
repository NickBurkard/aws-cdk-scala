package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatabaseProxyOptions {

  def apply(
    secrets: List[_ <: software.amazon.awscdk.services.secretsmanager.ISecret],
    vpc: software.amazon.awscdk.services.ec2.IVpc,
    iamAuth: Option[Boolean] = None,
    maxConnectionsPercent: Option[Number] = None,
    maxIdleConnectionsPercent: Option[Number] = None,
    sessionPinningFilters: Option[List[_ <: software.amazon.awscdk.services.rds.SessionPinningFilter]] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    requireTls: Option[Boolean] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    initQuery: Option[String] = None,
    debugLogging: Option[Boolean] = None,
    borrowTimeout: Option[software.amazon.awscdk.Duration] = None,
    dbProxyName: Option[String] = None,
    idleClientTimeout: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.rds.DatabaseProxyOptions =
    (new software.amazon.awscdk.services.rds.DatabaseProxyOptions.Builder)
      .secrets(secrets.asJava)
      .vpc(vpc)
      .iamAuth(iamAuth.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .maxConnectionsPercent(maxConnectionsPercent.orNull)
      .maxIdleConnectionsPercent(maxIdleConnectionsPercent.orNull)
      .sessionPinningFilters(sessionPinningFilters.map(_.asJava).orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .requireTls(requireTls.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .role(role.orNull)
      .initQuery(initQuery.orNull)
      .debugLogging(debugLogging.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .borrowTimeout(borrowTimeout.orNull)
      .dbProxyName(dbProxyName.orNull)
      .idleClientTimeout(idleClientTimeout.orNull)
      .build()
}
