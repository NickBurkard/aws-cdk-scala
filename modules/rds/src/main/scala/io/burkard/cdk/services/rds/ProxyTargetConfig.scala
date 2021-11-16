package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ProxyTargetConfig {

  def apply(
    engineFamily: String,
    dbInstances: Option[List[_ <: software.amazon.awscdk.services.rds.IDatabaseInstance]] = None,
    dbClusters: Option[List[_ <: software.amazon.awscdk.services.rds.IDatabaseCluster]] = None
  ): software.amazon.awscdk.services.rds.ProxyTargetConfig =
    (new software.amazon.awscdk.services.rds.ProxyTargetConfig.Builder)
      .engineFamily(engineFamily)
      .dbInstances(dbInstances.map(_.asJava).orNull)
      .dbClusters(dbClusters.map(_.asJava).orNull)
      .build()
}
