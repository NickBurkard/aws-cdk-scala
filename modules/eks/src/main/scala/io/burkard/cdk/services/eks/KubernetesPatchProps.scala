package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KubernetesPatchProps {

  def apply(
    applyPatch: Map[String, _],
    restorePatch: Map[String, _],
    resourceName: String,
    cluster: software.amazon.awscdk.services.eks.ICluster,
    patchType: Option[software.amazon.awscdk.services.eks.PatchType] = None,
    resourceNamespace: Option[String] = None
  ): software.amazon.awscdk.services.eks.KubernetesPatchProps =
    (new software.amazon.awscdk.services.eks.KubernetesPatchProps.Builder)
      .applyPatch(applyPatch.asJava)
      .restorePatch(restorePatch.asJava)
      .resourceName(resourceName)
      .cluster(cluster)
      .patchType(patchType.orNull)
      .resourceNamespace(resourceNamespace.orNull)
      .build()
}
