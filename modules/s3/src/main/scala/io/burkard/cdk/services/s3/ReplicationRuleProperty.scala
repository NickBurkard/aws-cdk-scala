package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReplicationRuleProperty {

  def apply(
    status: String,
    destination: software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty,
    priority: Option[Number] = None,
    sourceSelectionCriteria: Option[software.amazon.awscdk.services.s3.CfnBucket.SourceSelectionCriteriaProperty] = None,
    prefix: Option[String] = None,
    filter: Option[software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleFilterProperty] = None,
    id: Option[String] = None,
    deleteMarkerReplication: Option[software.amazon.awscdk.services.s3.CfnBucket.DeleteMarkerReplicationProperty] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty.Builder)
      .status(status)
      .destination(destination)
      .priority(priority.orNull)
      .sourceSelectionCriteria(sourceSelectionCriteria.orNull)
      .prefix(prefix.orNull)
      .filter(filter.orNull)
      .id(id.orNull)
      .deleteMarkerReplication(deleteMarkerReplication.orNull)
      .build()
}
