package io.burkard.cdk.services.redshift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResumeClusterMessageProperty {

  def apply(
    clusterIdentifier: String
  ): software.amazon.awscdk.services.redshift.CfnScheduledAction.ResumeClusterMessageProperty =
    (new software.amazon.awscdk.services.redshift.CfnScheduledAction.ResumeClusterMessageProperty.Builder)
      .clusterIdentifier(clusterIdentifier)
      .build()
}
