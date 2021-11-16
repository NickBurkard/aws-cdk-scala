package io.burkard.cdk.services.redshift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PauseClusterMessageProperty {

  def apply(
    clusterIdentifier: String
  ): software.amazon.awscdk.services.redshift.CfnScheduledAction.PauseClusterMessageProperty =
    (new software.amazon.awscdk.services.redshift.CfnScheduledAction.PauseClusterMessageProperty.Builder)
      .clusterIdentifier(clusterIdentifier)
      .build()
}
