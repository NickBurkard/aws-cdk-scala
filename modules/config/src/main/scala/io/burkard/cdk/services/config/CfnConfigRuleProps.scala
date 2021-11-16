package io.burkard.cdk.services.config

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConfigRuleProps {

  def apply(
    source: software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty,
    maximumExecutionFrequency: Option[String] = None,
    inputParameters: Option[AnyRef] = None,
    configRuleName: Option[String] = None,
    description: Option[String] = None,
    scope: Option[software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty] = None
  ): software.amazon.awscdk.services.config.CfnConfigRuleProps =
    (new software.amazon.awscdk.services.config.CfnConfigRuleProps.Builder)
      .source(source)
      .maximumExecutionFrequency(maximumExecutionFrequency.orNull)
      .inputParameters(inputParameters.orNull)
      .configRuleName(configRuleName.orNull)
      .description(description.orNull)
      .scope(scope.orNull)
      .build()
}
