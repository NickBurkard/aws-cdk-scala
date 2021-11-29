package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KubernetesManifestProps {

  def apply(
    cluster: software.amazon.awscdk.services.eks.ICluster,
    manifest: List[_ <: Map[String, _]],
    skipValidation: Option[Boolean] = None,
    ingressAlb: Option[Boolean] = None,
    prune: Option[Boolean] = None,
    ingressAlbScheme: Option[software.amazon.awscdk.services.eks.AlbScheme] = None,
    overwrite: Option[Boolean] = None
  ): software.amazon.awscdk.services.eks.KubernetesManifestProps =
    (new software.amazon.awscdk.services.eks.KubernetesManifestProps.Builder)
      .cluster(cluster)
      .manifest(manifest.map(_.asJava).asJava)
      .skipValidation(skipValidation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ingressAlb(ingressAlb.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .prune(prune.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ingressAlbScheme(ingressAlbScheme.orNull)
      .overwrite(overwrite.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
