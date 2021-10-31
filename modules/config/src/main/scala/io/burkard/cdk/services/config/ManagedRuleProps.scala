package io.burkard.cdk.services.config

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ManagedRuleProps {

  def apply(
    identifier: Option[String] = None,
    description: Option[String] = None,
    ruleScope: Option[software.amazon.awscdk.services.config.RuleScope] = None,
    maximumExecutionFrequency: Option[software.amazon.awscdk.services.config.MaximumExecutionFrequency] = None,
    inputParameters: Option[Map[String, _]] = None,
    configRuleName: Option[String] = None
  ): software.amazon.awscdk.services.config.ManagedRuleProps =
    (new software.amazon.awscdk.services.config.ManagedRuleProps.Builder)
      .identifier(identifier.orNull)
      .description(description.orNull)
      .ruleScope(ruleScope.orNull)
      .maximumExecutionFrequency(maximumExecutionFrequency.orNull)
      .inputParameters(inputParameters.map(_.asJava).orNull)
      .configRuleName(configRuleName.orNull)
      .build()
}
