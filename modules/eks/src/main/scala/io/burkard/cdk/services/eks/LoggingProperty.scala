package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoggingProperty {

  def apply(
    clusterLogging: Option[software.amazon.awscdk.services.eks.CfnCluster.ClusterLoggingProperty] = None
  ): software.amazon.awscdk.services.eks.CfnCluster.LoggingProperty =
    (new software.amazon.awscdk.services.eks.CfnCluster.LoggingProperty.Builder)
      .clusterLogging(clusterLogging.orNull)
      .build()
}
