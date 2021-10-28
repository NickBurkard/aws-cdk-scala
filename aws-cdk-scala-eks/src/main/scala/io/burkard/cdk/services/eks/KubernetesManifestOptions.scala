package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KubernetesManifestOptions {

  def apply(
    skipValidation: Option[Boolean] = None,
    prune: Option[Boolean] = None
  ): software.amazon.awscdk.services.eks.KubernetesManifestOptions =
    (new software.amazon.awscdk.services.eks.KubernetesManifestOptions.Builder)
      .skipValidation(skipValidation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .prune(prune.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
