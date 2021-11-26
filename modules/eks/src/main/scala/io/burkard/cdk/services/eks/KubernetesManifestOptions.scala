package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KubernetesManifestOptions {

  def apply(
    skipValidation: Option[Boolean] = None,
    ingressAlb: Option[Boolean] = None,
    prune: Option[Boolean] = None,
    ingressAlbScheme: Option[software.amazon.awscdk.services.eks.AlbScheme] = None
  ): software.amazon.awscdk.services.eks.KubernetesManifestOptions =
    (new software.amazon.awscdk.services.eks.KubernetesManifestOptions.Builder)
      .skipValidation(skipValidation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ingressAlb(ingressAlb.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .prune(prune.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ingressAlbScheme(ingressAlbScheme.orNull)
      .build()
}
