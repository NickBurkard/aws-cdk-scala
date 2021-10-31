package io.burkard.cdk.services.ecr

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnReplicationConfiguration {

  def apply(
    internalResourceId: String,
    replicationConfiguration: Option[software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationConfigurationProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecr.CfnReplicationConfiguration =
    software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.Builder
      .create(stackCtx, internalResourceId)
      .replicationConfiguration(replicationConfiguration.orNull)
      .build()
}
