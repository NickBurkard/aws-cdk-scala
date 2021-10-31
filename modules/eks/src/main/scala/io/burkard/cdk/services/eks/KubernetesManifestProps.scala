package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KubernetesManifestProps {

  def apply(
    skipValidation: Option[Boolean] = None,
    cluster: Option[software.amazon.awscdk.services.eks.ICluster] = None,
    prune: Option[Boolean] = None,
    manifest: Option[List[_ <: Map[String, _]]] = None,
    overwrite: Option[Boolean] = None
  ): software.amazon.awscdk.services.eks.KubernetesManifestProps =
    (new software.amazon.awscdk.services.eks.KubernetesManifestProps.Builder)
      .skipValidation(skipValidation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cluster(cluster.orNull)
      .prune(prune.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .manifest(manifest.map(_.map(_.asJava).asJava).orNull)
      .overwrite(overwrite.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
