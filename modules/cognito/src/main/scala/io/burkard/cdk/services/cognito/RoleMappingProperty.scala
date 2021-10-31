package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RoleMappingProperty {

  def apply(
    rulesConfiguration: Option[software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty] = None,
    identityProvider: Option[String] = None,
    ambiguousRoleResolution: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RoleMappingProperty =
    (new software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RoleMappingProperty.Builder)
      .rulesConfiguration(rulesConfiguration.orNull)
      .identityProvider(identityProvider.orNull)
      .ambiguousRoleResolution(ambiguousRoleResolution.orNull)
      .`type`(`type`.orNull)
      .build()
}
