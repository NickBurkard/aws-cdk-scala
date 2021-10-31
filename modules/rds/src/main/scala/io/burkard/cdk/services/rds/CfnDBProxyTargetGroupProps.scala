package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDBProxyTargetGroupProps {

  def apply(
    connectionPoolConfigurationInfo: Option[software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty] = None,
    dbInstanceIdentifiers: Option[List[String]] = None,
    targetGroupName: Option[String] = None,
    dbClusterIdentifiers: Option[List[String]] = None,
    dbProxyName: Option[String] = None
  ): software.amazon.awscdk.services.rds.CfnDBProxyTargetGroupProps =
    (new software.amazon.awscdk.services.rds.CfnDBProxyTargetGroupProps.Builder)
      .connectionPoolConfigurationInfo(connectionPoolConfigurationInfo.orNull)
      .dbInstanceIdentifiers(dbInstanceIdentifiers.map(_.asJava).orNull)
      .targetGroupName(targetGroupName.orNull)
      .dbClusterIdentifiers(dbClusterIdentifiers.map(_.asJava).orNull)
      .dbProxyName(dbProxyName.orNull)
      .build()
}
