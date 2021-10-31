package io.burkard.cdk.services.config

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomRuleProps {

  def apply(
    description: Option[String] = None,
    configurationChanges: Option[Boolean] = None,
    lambdaFunction: Option[software.amazon.awscdk.services.lambda.IFunction] = None,
    ruleScope: Option[software.amazon.awscdk.services.config.RuleScope] = None,
    maximumExecutionFrequency: Option[software.amazon.awscdk.services.config.MaximumExecutionFrequency] = None,
    periodic: Option[Boolean] = None,
    inputParameters: Option[Map[String, _]] = None,
    configRuleName: Option[String] = None
  ): software.amazon.awscdk.services.config.CustomRuleProps =
    (new software.amazon.awscdk.services.config.CustomRuleProps.Builder)
      .description(description.orNull)
      .configurationChanges(configurationChanges.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .lambdaFunction(lambdaFunction.orNull)
      .ruleScope(ruleScope.orNull)
      .maximumExecutionFrequency(maximumExecutionFrequency.orNull)
      .periodic(periodic.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .inputParameters(inputParameters.map(_.asJava).orNull)
      .configRuleName(configRuleName.orNull)
      .build()
}
