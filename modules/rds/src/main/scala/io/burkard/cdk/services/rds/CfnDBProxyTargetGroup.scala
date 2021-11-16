package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDBProxyTargetGroup {

  def apply(
    internalResourceId: String,
    targetGroupName: String,
    dbProxyName: String,
    connectionPoolConfigurationInfo: Option[software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty] = None,
    dbInstanceIdentifiers: Option[List[String]] = None,
    dbClusterIdentifiers: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup =
    software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup.Builder
      .create(stackCtx, internalResourceId)
      .targetGroupName(targetGroupName)
      .dbProxyName(dbProxyName)
      .connectionPoolConfigurationInfo(connectionPoolConfigurationInfo.orNull)
      .dbInstanceIdentifiers(dbInstanceIdentifiers.map(_.asJava).orNull)
      .dbClusterIdentifiers(dbClusterIdentifiers.map(_.asJava).orNull)
      .build()
}
