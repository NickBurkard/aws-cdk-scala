package io.burkard.cdk.services.config

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnOrganizationConfigRuleProps {

  def apply(
    organizationCustomRuleMetadata: Option[software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty] = None,
    excludedAccounts: Option[List[String]] = None,
    organizationConfigRuleName: Option[String] = None,
    organizationManagedRuleMetadata: Option[software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty] = None
  ): software.amazon.awscdk.services.config.CfnOrganizationConfigRuleProps =
    (new software.amazon.awscdk.services.config.CfnOrganizationConfigRuleProps.Builder)
      .organizationCustomRuleMetadata(organizationCustomRuleMetadata.orNull)
      .excludedAccounts(excludedAccounts.map(_.asJava).orNull)
      .organizationConfigRuleName(organizationConfigRuleName.orNull)
      .organizationManagedRuleMetadata(organizationManagedRuleMetadata.orNull)
      .build()
}
