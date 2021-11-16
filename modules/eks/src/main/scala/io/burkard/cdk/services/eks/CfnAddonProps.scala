package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAddonProps {

  def apply(
    clusterName: String,
    addonName: String,
    resolveConflicts: Option[String] = None,
    addonVersion: Option[String] = None,
    serviceAccountRoleArn: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.eks.CfnAddonProps =
    (new software.amazon.awscdk.services.eks.CfnAddonProps.Builder)
      .clusterName(clusterName)
      .addonName(addonName)
      .resolveConflicts(resolveConflicts.orNull)
      .addonVersion(addonVersion.orNull)
      .serviceAccountRoleArn(serviceAccountRoleArn.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
