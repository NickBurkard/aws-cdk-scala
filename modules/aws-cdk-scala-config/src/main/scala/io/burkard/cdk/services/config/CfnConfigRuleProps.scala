package io.burkard.cdk.services.config

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConfigRuleProps {

  def apply(
    source: Option[software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty] = None,
    maximumExecutionFrequency: Option[String] = None,
    inputParameters: Option[AnyRef] = None,
    configRuleName: Option[String] = None,
    description: Option[String] = None,
    scope: Option[software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty] = None
  ): software.amazon.awscdk.services.config.CfnConfigRuleProps =
    (new software.amazon.awscdk.services.config.CfnConfigRuleProps.Builder)
      .source(source.orNull)
      .maximumExecutionFrequency(maximumExecutionFrequency.orNull)
      .inputParameters(inputParameters.orNull)
      .configRuleName(configRuleName.orNull)
      .description(description.orNull)
      .scope(scope.orNull)
      .build()
}
