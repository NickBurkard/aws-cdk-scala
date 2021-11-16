package io.burkard.cdk.services.eventschemas

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRegistryPolicyProps {

  def apply(
    registryName: String,
    policy: AnyRef,
    revisionId: Option[String] = None
  ): software.amazon.awscdk.services.eventschemas.CfnRegistryPolicyProps =
    (new software.amazon.awscdk.services.eventschemas.CfnRegistryPolicyProps.Builder)
      .registryName(registryName)
      .policy(policy)
      .revisionId(revisionId.orNull)
      .build()
}
