package io.burkard.cdk.services.eventschemas

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRegistryPolicy {

  def apply(
    internalResourceId: String,
    revisionId: Option[String] = None,
    registryName: Option[String] = None,
    policy: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.eventschemas.CfnRegistryPolicy =
    software.amazon.awscdk.services.eventschemas.CfnRegistryPolicy.Builder
      .create(stackCtx, internalResourceId)
      .revisionId(revisionId.orNull)
      .registryName(registryName.orNull)
      .policy(policy.orNull)
      .build()
}
