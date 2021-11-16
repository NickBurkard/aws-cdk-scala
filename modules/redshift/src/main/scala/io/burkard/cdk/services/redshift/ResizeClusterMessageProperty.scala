package io.burkard.cdk.services.redshift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResizeClusterMessageProperty {

  def apply(
    clusterIdentifier: String,
    numberOfNodes: Option[Number] = None,
    classic: Option[Boolean] = None,
    nodeType: Option[String] = None,
    clusterType: Option[String] = None
  ): software.amazon.awscdk.services.redshift.CfnScheduledAction.ResizeClusterMessageProperty =
    (new software.amazon.awscdk.services.redshift.CfnScheduledAction.ResizeClusterMessageProperty.Builder)
      .clusterIdentifier(clusterIdentifier)
      .numberOfNodes(numberOfNodes.orNull)
      .classic(classic.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .nodeType(nodeType.orNull)
      .clusterType(clusterType.orNull)
      .build()
}
