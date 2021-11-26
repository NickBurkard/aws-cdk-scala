package io.burkard.cdk.services.s3

sealed abstract class EventType(val underlying: software.amazon.awscdk.services.s3.EventType)
  extends Product
    with Serializable

object EventType {
  implicit def toAws(value: EventType): software.amazon.awscdk.services.s3.EventType =
    Option(value).map(_.underlying).orNull

  case object ObjectCreated
    extends EventType(software.amazon.awscdk.services.s3.EventType.OBJECT_CREATED)

  case object ObjectCreatedCompleteMultipartUpload
    extends EventType(software.amazon.awscdk.services.s3.EventType.OBJECT_CREATED_COMPLETE_MULTIPART_UPLOAD)

  case object ObjectCreatedCopy
    extends EventType(software.amazon.awscdk.services.s3.EventType.OBJECT_CREATED_COPY)

  case object ObjectCreatedPost
    extends EventType(software.amazon.awscdk.services.s3.EventType.OBJECT_CREATED_POST)

  case object ObjectCreatedPut
    extends EventType(software.amazon.awscdk.services.s3.EventType.OBJECT_CREATED_PUT)

  case object ObjectRemoved
    extends EventType(software.amazon.awscdk.services.s3.EventType.OBJECT_REMOVED)

  case object ObjectRemovedDelete
    extends EventType(software.amazon.awscdk.services.s3.EventType.OBJECT_REMOVED_DELETE)

  case object ObjectRemovedDeleteMarkerCreated
    extends EventType(software.amazon.awscdk.services.s3.EventType.OBJECT_REMOVED_DELETE_MARKER_CREATED)

  case object ObjectRestoreCompleted
    extends EventType(software.amazon.awscdk.services.s3.EventType.OBJECT_RESTORE_COMPLETED)

  case object ObjectRestorePost
    extends EventType(software.amazon.awscdk.services.s3.EventType.OBJECT_RESTORE_POST)

  case object ReducedRedundancyLostObject
    extends EventType(software.amazon.awscdk.services.s3.EventType.REDUCED_REDUNDANCY_LOST_OBJECT)

  case object ReplicationOperationFailedReplication
    extends EventType(software.amazon.awscdk.services.s3.EventType.REPLICATION_OPERATION_FAILED_REPLICATION)

  case object ReplicationOperationMissedThreshold
    extends EventType(software.amazon.awscdk.services.s3.EventType.REPLICATION_OPERATION_MISSED_THRESHOLD)

  case object ReplicationOperationNotTracked
    extends EventType(software.amazon.awscdk.services.s3.EventType.REPLICATION_OPERATION_NOT_TRACKED)

  case object ReplicationOperationReplicatedAfterThreshold
    extends EventType(software.amazon.awscdk.services.s3.EventType.REPLICATION_OPERATION_REPLICATED_AFTER_THRESHOLD)
}
