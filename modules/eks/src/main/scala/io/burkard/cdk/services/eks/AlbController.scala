package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AlbController {

  def apply(
    internalResourceId: String,
    cluster: software.amazon.awscdk.services.eks.Cluster,
    repository: Option[String] = None,
    policy: Option[AnyRef] = None,
    version: Option[software.amazon.awscdk.services.eks.AlbControllerVersion] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.eks.AlbController =
    software.amazon.awscdk.services.eks.AlbController.Builder
      .create(stackCtx, internalResourceId)
      .cluster(cluster)
      .repository(repository.orNull)
      .policy(policy.orNull)
      .version(version.orNull)
      .build()
}
