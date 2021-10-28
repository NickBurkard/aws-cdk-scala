package io.burkard.cdk.services.eventschemas

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRegistryPolicyProps {

  def apply(
    revisionId: Option[String] = None,
    registryName: Option[String] = None,
    policy: Option[AnyRef] = None
  ): software.amazon.awscdk.services.eventschemas.CfnRegistryPolicyProps =
    (new software.amazon.awscdk.services.eventschemas.CfnRegistryPolicyProps.Builder)
      .revisionId(revisionId.orNull)
      .registryName(registryName.orNull)
      .policy(policy.orNull)
      .build()
}
