package io.burkard.cdk.services.elasticsearch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AdvancedSecurityOptionsInputProperty {

  def apply(
    masterUserOptions: Option[software.amazon.awscdk.services.elasticsearch.CfnDomain.MasterUserOptionsProperty] = None,
    enabled: Option[Boolean] = None,
    internalUserDatabaseEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.elasticsearch.CfnDomain.AdvancedSecurityOptionsInputProperty =
    (new software.amazon.awscdk.services.elasticsearch.CfnDomain.AdvancedSecurityOptionsInputProperty.Builder)
      .masterUserOptions(masterUserOptions.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .internalUserDatabaseEnabled(internalUserDatabaseEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
