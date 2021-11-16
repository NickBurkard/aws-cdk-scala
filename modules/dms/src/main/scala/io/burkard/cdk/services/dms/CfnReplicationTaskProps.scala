package io.burkard.cdk.services.dms

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnReplicationTaskProps {

  def apply(
    replicationInstanceArn: String,
    targetEndpointArn: String,
    migrationType: String,
    sourceEndpointArn: String,
    tableMappings: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    replicationTaskIdentifier: Option[String] = None,
    taskData: Option[String] = None,
    replicationTaskSettings: Option[String] = None,
    cdcStartTime: Option[Number] = None,
    cdcStopPosition: Option[String] = None,
    resourceIdentifier: Option[String] = None,
    cdcStartPosition: Option[String] = None
  ): software.amazon.awscdk.services.dms.CfnReplicationTaskProps =
    (new software.amazon.awscdk.services.dms.CfnReplicationTaskProps.Builder)
      .replicationInstanceArn(replicationInstanceArn)
      .targetEndpointArn(targetEndpointArn)
      .migrationType(migrationType)
      .sourceEndpointArn(sourceEndpointArn)
      .tableMappings(tableMappings)
      .tags(tags.map(_.asJava).orNull)
      .replicationTaskIdentifier(replicationTaskIdentifier.orNull)
      .taskData(taskData.orNull)
      .replicationTaskSettings(replicationTaskSettings.orNull)
      .cdcStartTime(cdcStartTime.orNull)
      .cdcStopPosition(cdcStopPosition.orNull)
      .resourceIdentifier(resourceIdentifier.orNull)
      .cdcStartPosition(cdcStartPosition.orNull)
      .build()
}
