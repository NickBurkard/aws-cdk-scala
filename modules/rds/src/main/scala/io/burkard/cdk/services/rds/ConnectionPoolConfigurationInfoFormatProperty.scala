package io.burkard.cdk.services.rds

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConnectionPoolConfigurationInfoFormatProperty {

  def apply(
    maxConnectionsPercent: Option[Number] = None,
    maxIdleConnectionsPercent: Option[Number] = None,
    sessionPinningFilters: Option[List[String]] = None,
    initQuery: Option[String] = None,
    connectionBorrowTimeout: Option[Number] = None
  ): software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty =
    (new software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty.Builder)
      .maxConnectionsPercent(maxConnectionsPercent.orNull)
      .maxIdleConnectionsPercent(maxIdleConnectionsPercent.orNull)
      .sessionPinningFilters(sessionPinningFilters.map(_.asJava).orNull)
      .initQuery(initQuery.orNull)
      .connectionBorrowTimeout(connectionBorrowTimeout.orNull)
      .build()
}
