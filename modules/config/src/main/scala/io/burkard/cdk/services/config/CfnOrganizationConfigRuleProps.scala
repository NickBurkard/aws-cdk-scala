package io.burkard.cdk.services.config

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnOrganizationConfigRuleProps {

  def apply(
    organizationConfigRuleName: String,
    organizationCustomRuleMetadata: Option[software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty] = None,
    excludedAccounts: Option[List[String]] = None,
    organizationManagedRuleMetadata: Option[software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty] = None
  ): software.amazon.awscdk.services.config.CfnOrganizationConfigRuleProps =
    (new software.amazon.awscdk.services.config.CfnOrganizationConfigRuleProps.Builder)
      .organizationConfigRuleName(organizationConfigRuleName)
      .organizationCustomRuleMetadata(organizationCustomRuleMetadata.orNull)
      .excludedAccounts(excludedAccounts.map(_.asJava).orNull)
      .organizationManagedRuleMetadata(organizationManagedRuleMetadata.orNull)
      .build()
}
