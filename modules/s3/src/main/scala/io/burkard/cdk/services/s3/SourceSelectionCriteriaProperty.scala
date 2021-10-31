package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
