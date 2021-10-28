package io.burkard.cdk.services.config

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConfigRule {

  def apply(
    internalResourceId: String,
    source: Option[software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty] = None,
    maximumExecutionFrequency: Option[String] = None,
    inputParameters: Option[AnyRef] = None,
    configRuleName: Option[String] = None,
    description: Option[String] = None,
    scope: Option[software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.config.CfnConfigRule =
    software.amazon.awscdk.services.config.CfnConfigRule.Builder
      .create(stackCtx, internalResourceId)
      .source(source.orNull)
      .maximumExecutionFrequency(maximumExecutionFrequency.orNull)
      .inputParameters(inputParameters.orNull)
      .configRuleName(configRuleName.orNull)
      .description(description.orNull)
      .scope(scope.orNull)
      .build()
}
