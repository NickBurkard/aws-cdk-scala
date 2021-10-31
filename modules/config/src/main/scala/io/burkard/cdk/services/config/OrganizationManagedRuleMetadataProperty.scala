package io.burkard.cdk.services.config

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OrganizationManagedRuleMetadataProperty {

  def apply(
    ruleIdentifier: Option[String] = None,
    description: Option[String] = None,
    resourceTypesScope: Option[List[String]] = None,
    maximumExecutionFrequency: Option[String] = None,
    tagKeyScope: Option[String] = None,
    resourceIdScope: Option[String] = None,
    inputParameters: Option[String] = None,
    tagValueScope: Option[String] = None
  ): software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty =
    (new software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty.Builder)
      .ruleIdentifier(ruleIdentifier.orNull)
      .description(description.orNull)
      .resourceTypesScope(resourceTypesScope.map(_.asJava).orNull)
      .maximumExecutionFrequency(maximumExecutionFrequency.orNull)
      .tagKeyScope(tagKeyScope.orNull)
      .resourceIdScope(resourceIdScope.orNull)
      .inputParameters(inputParameters.orNull)
      .tagValueScope(tagValueScope.orNull)
      .build()
}
