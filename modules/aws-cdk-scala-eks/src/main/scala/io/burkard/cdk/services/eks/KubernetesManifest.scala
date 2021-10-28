package io.burkard.cdk.services.eks

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KubernetesManifest {

  def apply(
    internalResourceId: String,
    skipValidation: Option[Boolean] = None,
    cluster: Option[software.amazon.awscdk.services.eks.ICluster] = None,
    prune: Option[Boolean] = None,
    manifest: Option[List[_ <: Map[String, _]]] = None,
    overwrite: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.eks.KubernetesManifest =
    software.amazon.awscdk.services.eks.KubernetesManifest.Builder
      .create(stackCtx, internalResourceId)
      .skipValidation(skipValidation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cluster(cluster.orNull)
      .prune(prune.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .manifest(manifest.map(_.map(_.asJava).asJava).orNull)
      .overwrite(overwrite.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
