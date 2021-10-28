package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SourceSelectionCriteriaProperty {

  def apply(
    replicaModifications: Option[software.amazon.awscdk.services.s3.CfnBucket.ReplicaModificationsProperty] = None,
    sseKmsEncryptedObjects: Option[software.amazon.awscdk.services.s3.CfnBucket.SseKmsEncryptedObjectsProperty] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.SourceSelectionCriteriaProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.SourceSelectionCriteriaProperty.Builder)
      .replicaModifications(replicaModifications.orNull)
      .sseKmsEncryptedObjects(sseKmsEncryptedObjects.orNull)
      .build()
}
