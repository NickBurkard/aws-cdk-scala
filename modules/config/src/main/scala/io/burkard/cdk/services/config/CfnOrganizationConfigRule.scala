package io.burkard.cdk.services.config

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnOrganizationConfigRule {

  def apply(
    internalResourceId: String,
    organizationConfigRuleName: String,
    organizationCustomRuleMetadata: Option[software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty] = None,
    excludedAccounts: Option[List[String]] = None,
    organizationManagedRuleMetadata: Option[software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.config.CfnOrganizationConfigRule =
    software.amazon.awscdk.services.config.CfnOrganizationConfigRule.Builder
      .create(stackCtx, internalResourceId)
      .organizationConfigRuleName(organizationConfigRuleName)
      .organizationCustomRuleMetadata(organizationCustomRuleMetadata.orNull)
      .excludedAccounts(excludedAccounts.map(_.asJava).orNull)
      .organizationManagedRuleMetadata(organizationManagedRuleMetadata.orNull)
      .build()
}
