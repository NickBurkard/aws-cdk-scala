package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAddon {

  def apply(
    internalResourceId: String,
    clusterName: String,
    addonName: String,
    resolveConflicts: Option[String] = None,
    addonVersion: Option[String] = None,
    serviceAccountRoleArn: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.eks.CfnAddon =
    software.amazon.awscdk.services.eks.CfnAddon.Builder
      .create(stackCtx, internalResourceId)
      .clusterName(clusterName)
      .addonName(addonName)
      .resolveConflicts(resolveConflicts.orNull)
      .addonVersion(addonVersion.orNull)
      .serviceAccountRoleArn(serviceAccountRoleArn.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
