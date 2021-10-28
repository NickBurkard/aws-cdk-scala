package io.burkard.cdk.services.dms

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnReplicationTask {

  def apply(
    internalResourceId: String,
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
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.dms.CfnReplicationTask =
    software.amazon.awscdk.services.dms.CfnReplicationTask.Builder
      .create(stackCtx, internalResourceId)
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
