package io.burkard.cdk.services.config

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OrganizationCustomRuleMetadataProperty {

  def apply(
    organizationConfigRuleTriggerTypes: Option[List[String]] = None,
    description: Option[String] = None,
    lambdaFunctionArn: Option[String] = None,
    resourceTypesScope: Option[List[String]] = None,
    maximumExecutionFrequency: Option[String] = None,
    tagKeyScope: Option[String] = None,
    resourceIdScope: Option[String] = None,
    inputParameters: Option[String] = None,
    tagValueScope: Option[String] = None
  ): software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty =
    (new software.amazon.awscdk.services.config.CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty.Builder)
      .organizationConfigRuleTriggerTypes(organizationConfigRuleTriggerTypes.map(_.asJava).orNull)
      .description(description.orNull)
      .lambdaFunctionArn(lambdaFunctionArn.orNull)
      .resourceTypesScope(resourceTypesScope.map(_.asJava).orNull)
      .maximumExecutionFrequency(maximumExecutionFrequency.orNull)
      .tagKeyScope(tagKeyScope.orNull)
      .resourceIdScope(resourceIdScope.orNull)
      .inputParameters(inputParameters.orNull)
      .tagValueScope(tagValueScope.orNull)
      .build()
}
