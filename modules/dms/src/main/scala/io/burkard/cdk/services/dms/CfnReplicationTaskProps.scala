package io.burkard.cdk.services.dms

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnReplicationTaskProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    replicationInstanceArn: Option[String] = None,
    replicationTaskIdentifier: Option[String] = None,
    targetEndpointArn: Option[String] = None,
    migrationType: Option[String] = None,
    taskData: Option[String] = None,
    sourceEndpointArn: Option[String] = None,
    replicationTaskSettings: Option[String] = None,
    tableMappings: Option[String] = None,
    cdcStartTime: Option[Number] = None,
    cdcStopPosition: Option[String] = None,
    resourceIdentifier: Option[String] = None,
    cdcStartPosition: Option[String] = None
  ): software.amazon.awscdk.services.dms.CfnReplicationTaskProps =
    (new software.amazon.awscdk.services.dms.CfnReplicationTaskProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .replicationInstanceArn(replicationInstanceArn.orNull)
      .replicationTaskIdentifier(replicationTaskIdentifier.orNull)
      .targetEndpointArn(targetEndpointArn.orNull)
      .migrationType(migrationType.orNull)
      .taskData(taskData.orNull)
      .sourceEndpointArn(sourceEndpointArn.orNull)
      .replicationTaskSettings(replicationTaskSettings.orNull)
      .tableMappings(tableMappings.orNull)
      .cdcStartTime(cdcStartTime.orNull)
      .cdcStopPosition(cdcStopPosition.orNull)
      .resourceIdentifier(resourceIdentifier.orNull)
      .cdcStartPosition(cdcStartPosition.orNull)
      .build()
}
