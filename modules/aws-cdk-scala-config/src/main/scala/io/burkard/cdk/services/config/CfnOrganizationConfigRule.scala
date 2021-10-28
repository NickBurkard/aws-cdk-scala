package io.burkard.cdk.services.config

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnOrganizationConfigRule {

  def apply(
    internalResourceId: String,
    organizationCustomRuleMetadata: Option[software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty] = None,
    excludedAccounts: Option[List[String]] = None,
    organizationConfigRuleName: Option[String] = None,
    organizationManagedRuleMetadata: Option[software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.config.CfnOrganizationConfigRule =
    software.amazon.awscdk.services.config.CfnOrganizationConfigRule.Builder
      .create(stackCtx, internalResourceId)
      .organizationCustomRuleMetadata(organizationCustomRuleMetadata.orNull)
      .excludedAccounts(excludedAccounts.map(_.asJava).orNull)
      .organizationConfigRuleName(organizationConfigRuleName.orNull)
      .organizationManagedRuleMetadata(organizationManagedRuleMetadata.orNull)
      .build()
}
