package io.burkard.cdk.services.ecr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnReplicationConfigurationProps {

  def apply(
    replicationConfiguration: software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationConfigurationProperty
  ): software.amazon.awscdk.services.ecr.CfnReplicationConfigurationProps =
    (new software.amazon.awscdk.services.ecr.CfnReplicationConfigurationProps.Builder)
      .replicationConfiguration(replicationConfiguration)
      .build()
}
