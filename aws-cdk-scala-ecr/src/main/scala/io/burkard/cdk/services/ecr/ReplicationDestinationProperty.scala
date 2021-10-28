package io.burkard.cdk.services.ecr

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ReplicationDestinationProperty {

  def apply(
    registryId: Option[String] = None,
    region: Option[String] = None
  ): software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationDestinationProperty =
    (new software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationDestinationProperty.Builder)
      .registryId(registryId.orNull)
      .region(region.orNull)
      .build()
}
