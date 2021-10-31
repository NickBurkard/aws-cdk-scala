package io.burkard.cdk.services.config

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ManagedRule {

  def apply(
    internalResourceId: String,
    identifier: Option[String] = None,
    description: Option[String] = None,
    ruleScope: Option[software.amazon.awscdk.services.config.RuleScope] = None,
    maximumExecutionFrequency: Option[software.amazon.awscdk.services.config.MaximumExecutionFrequency] = None,
    inputParameters: Option[Map[String, _]] = None,
    configRuleName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.config.ManagedRule =
    software.amazon.awscdk.services.config.ManagedRule.Builder
      .create(stackCtx, internalResourceId)
      .identifier(identifier.orNull)
      .description(description.orNull)
      .ruleScope(ruleScope.orNull)
      .maximumExecutionFrequency(maximumExecutionFrequency.orNull)
      .inputParameters(inputParameters.map(_.asJava).orNull)
      .configRuleName(configRuleName.orNull)
      .build()
}
