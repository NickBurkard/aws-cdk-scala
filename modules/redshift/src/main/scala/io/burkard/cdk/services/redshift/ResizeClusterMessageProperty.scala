package io.burkard.cdk.services.redshift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResizeClusterMessageProperty {

  def apply(
    numberOfNodes: Option[Number] = None,
    clusterIdentifier: Option[String] = None,
    classic: Option[Boolean] = None,
    nodeType: Option[String] = None,
    clusterType: Option[String] = None
  ): software.amazon.awscdk.services.redshift.CfnScheduledAction.ResizeClusterMessageProperty =
    (new software.amazon.awscdk.services.redshift.CfnScheduledAction.ResizeClusterMessageProperty.Builder)
      .numberOfNodes(numberOfNodes.orNull)
      .clusterIdentifier(clusterIdentifier.orNull)
      .classic(classic.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .nodeType(nodeType.orNull)
      .clusterType(clusterType.orNull)
      .build()
}
