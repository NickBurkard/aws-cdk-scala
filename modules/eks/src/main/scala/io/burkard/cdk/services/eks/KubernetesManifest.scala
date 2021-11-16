package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KubernetesManifest {

  def apply(
    internalResourceId: String,
    cluster: software.amazon.awscdk.services.eks.ICluster,
    manifest: List[_ <: Map[String, _]],
    skipValidation: Option[Boolean] = None,
    prune: Option[Boolean] = None,
    overwrite: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.eks.KubernetesManifest =
    software.amazon.awscdk.services.eks.KubernetesManifest.Builder
      .create(stackCtx, internalResourceId)
      .cluster(cluster)
      .manifest(manifest.map(_.asJava).asJava)
      .skipValidation(skipValidation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .prune(prune.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .overwrite(overwrite.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
