package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AlbControllerProps {

  def apply(
    cluster: software.amazon.awscdk.services.eks.Cluster,
    repository: Option[String] = None,
    policy: Option[AnyRef] = None,
    version: Option[software.amazon.awscdk.services.eks.AlbControllerVersion] = None
  ): software.amazon.awscdk.services.eks.AlbControllerProps =
    (new software.amazon.awscdk.services.eks.AlbControllerProps.Builder)
      .cluster(cluster)
      .repository(repository.orNull)
      .policy(policy.orNull)
      .version(version.orNull)
      .build()
}
