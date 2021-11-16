package io.burkard.cdk.services.eventschemas

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRegistryPolicy {

  def apply(
    internalResourceId: String,
    registryName: String,
    policy: AnyRef,
    revisionId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.eventschemas.CfnRegistryPolicy =
    software.amazon.awscdk.services.eventschemas.CfnRegistryPolicy.Builder
      .create(stackCtx, internalResourceId)
      .registryName(registryName)
      .policy(policy)
      .revisionId(revisionId.orNull)
      .build()
}
