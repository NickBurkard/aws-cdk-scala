package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProxyTargetConfig {

  def apply(
    dbInstances: Option[List[_ <: software.amazon.awscdk.services.rds.IDatabaseInstance]] = None,
    engineFamily: Option[String] = None,
    dbClusters: Option[List[_ <: software.amazon.awscdk.services.rds.IDatabaseCluster]] = None
  ): software.amazon.awscdk.services.rds.ProxyTargetConfig =
    (new software.amazon.awscdk.services.rds.ProxyTargetConfig.Builder)
      .dbInstances(dbInstances.map(_.asJava).orNull)
      .engineFamily(engineFamily.orNull)
      .dbClusters(dbClusters.map(_.asJava).orNull)
      .build()
}
