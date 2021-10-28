package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ReplicationRuleProperty {

  def apply(
    priority: Option[Number] = None,
    sourceSelectionCriteria: Option[software.amazon.awscdk.services.s3.CfnBucket.SourceSelectionCriteriaProperty] = None,
    prefix: Option[String] = None,
    filter: Option[software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleFilterProperty] = None,
    id: Option[String] = None,
    status: Option[String] = None,
    deleteMarkerReplication: Option[software.amazon.awscdk.services.s3.CfnBucket.DeleteMarkerReplicationProperty] = None,
    destination: Option[software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty.Builder)
      .priority(priority.orNull)
      .sourceSelectionCriteria(sourceSelectionCriteria.orNull)
      .prefix(prefix.orNull)
      .filter(filter.orNull)
      .id(id.orNull)
      .status(status.orNull)
      .deleteMarkerReplication(deleteMarkerReplication.orNull)
      .destination(destination.orNull)
      .build()
}
