package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAddonProps {

  def apply(
    resolveConflicts: Option[String] = None,
    addonVersion: Option[String] = None,
    clusterName: Option[String] = None,
    addonName: Option[String] = None,
    serviceAccountRoleArn: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.eks.CfnAddonProps =
    (new software.amazon.awscdk.services.eks.CfnAddonProps.Builder)
      .resolveConflicts(resolveConflicts.orNull)
      .addonVersion(addonVersion.orNull)
      .clusterName(clusterName.orNull)
      .addonName(addonName.orNull)
      .serviceAccountRoleArn(serviceAccountRoleArn.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
