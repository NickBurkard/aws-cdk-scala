package io.burkard.cdk.services.config

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OrganizationManagedRuleMetadataProperty {

  def apply(
    ruleIdentifier: String,
    description: Option[String] = None,
    resourceTypesScope: Option[List[String]] = None,
    maximumExecutionFrequency: Option[String] = None,
    tagKeyScope: Option[String] = None,
    resourceIdScope: Option[String] = None,
    inputParameters: Option[String] = None,
    tagValueScope: Option[String] = None
  ): software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty =
    (new software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty.Builder)
      .ruleIdentifier(ruleIdentifier)
      .description(description.orNull)
      .resourceTypesScope(resourceTypesScope.map(_.asJava).orNull)
      .maximumExecutionFrequency(maximumExecutionFrequency.orNull)
      .tagKeyScope(tagKeyScope.orNull)
      .resourceIdScope(resourceIdScope.orNull)
      .inputParameters(inputParameters.orNull)
      .tagValueScope(tagValueScope.orNull)
      .build()
}
