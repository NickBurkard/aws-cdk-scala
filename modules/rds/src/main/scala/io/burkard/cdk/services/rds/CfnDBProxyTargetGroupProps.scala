package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDBProxyTargetGroupProps {

  def apply(
    targetGroupName: String,
    dbProxyName: String,
    connectionPoolConfigurationInfo: Option[software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty] = None,
    dbInstanceIdentifiers: Option[List[String]] = None,
    dbClusterIdentifiers: Option[List[String]] = None
  ): software.amazon.awscdk.services.rds.CfnDBProxyTargetGroupProps =
    (new software.amazon.awscdk.services.rds.CfnDBProxyTargetGroupProps.Builder)
      .targetGroupName(targetGroupName)
      .dbProxyName(dbProxyName)
      .connectionPoolConfigurationInfo(connectionPoolConfigurationInfo.orNull)
      .dbInstanceIdentifiers(dbInstanceIdentifiers.map(_.asJava).orNull)
      .dbClusterIdentifiers(dbClusterIdentifiers.map(_.asJava).orNull)
      .build()
}
