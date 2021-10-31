package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KubernetesPatch {

  def apply(
    internalResourceId: String,
    applyPatch: Option[Map[String, _]] = None,
    patchType: Option[software.amazon.awscdk.services.eks.PatchType] = None,
    resourceNamespace: Option[String] = None,
    restorePatch: Option[Map[String, _]] = None,
    resourceName: Option[String] = None,
    cluster: Option[software.amazon.awscdk.services.eks.ICluster] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.eks.KubernetesPatch =
    software.amazon.awscdk.services.eks.KubernetesPatch.Builder
      .create(stackCtx, internalResourceId)
      .applyPatch(applyPatch.map(_.asJava).orNull)
      .patchType(patchType.orNull)
      .resourceNamespace(resourceNamespace.orNull)
      .restorePatch(restorePatch.map(_.asJava).orNull)
      .resourceName(resourceName.orNull)
      .cluster(cluster.orNull)
      .build()
}
