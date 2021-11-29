package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AlbControllerOptions {

  def apply(
    version: software.amazon.awscdk.services.eks.AlbControllerVersion,
    repository: Option[String] = None,
    policy: Option[AnyRef] = None
  ): software.amazon.awscdk.services.eks.AlbControllerOptions =
    (new software.amazon.awscdk.services.eks.AlbControllerOptions.Builder)
      .version(version)
      .repository(repository.orNull)
      .policy(policy.orNull)
      .build()
}
