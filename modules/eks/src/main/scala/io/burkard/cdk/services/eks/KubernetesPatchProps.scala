package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KubernetesPatchProps {

  def apply(
    applyPatch: Option[Map[String, _]] = None,
    patchType: Option[software.amazon.awscdk.services.eks.PatchType] = None,
    resourceNamespace: Option[String] = None,
    restorePatch: Option[Map[String, _]] = None,
    resourceName: Option[String] = None,
    cluster: Option[software.amazon.awscdk.services.eks.ICluster] = None
  ): software.amazon.awscdk.services.eks.KubernetesPatchProps =
    (new software.amazon.awscdk.services.eks.KubernetesPatchProps.Builder)
      .applyPatch(applyPatch.map(_.asJava).orNull)
      .patchType(patchType.orNull)
      .resourceNamespace(resourceNamespace.orNull)
      .restorePatch(restorePatch.map(_.asJava).orNull)
      .resourceName(resourceName.orNull)
      .cluster(cluster.orNull)
      .build()
}
