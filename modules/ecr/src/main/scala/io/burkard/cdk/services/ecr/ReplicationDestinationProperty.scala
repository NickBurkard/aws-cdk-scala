package io.burkard.cdk.services.ecr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReplicationDestinationProperty {

  def apply(
    registryId: String,
    region: String
  ): software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationDestinationProperty =
    (new software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationDestinationProperty.Builder)
      .registryId(registryId)
      .region(region)
      .build()
}
